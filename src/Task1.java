import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose task (1-10):");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                        "write the function that returns minimum of them. ");
                System.out.println("write down the size of an array: ");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("write down all elements of an array: ");
                for (int i = 0; i < size; i++) {
                    int element = sc.nextInt();
                    arr[i] = element;
                }
                System.out.println(findMinInArray(size, arr));
                break;
            case 2:
                System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                        "write the function that returns average of them.");
                System.out.println("write down the size of an array: ");
                size = sc.nextInt();
                int[] arr1 = new int[size];
                System.out.println("write down all elements of an array: ");
                for (int i = 0; i < size; i++) {
                    int element = sc.nextInt();
                    arr1[i] = element;
                }
                System.out.println(findAverageInArray(size, arr1));
                break;
            case 3:
                System.out.println("You are given a number “n”, write the function for checking\n" +
                        "whether“n” is prime.");
                System.out.println("write your number: ");
                int num = sc.nextInt();
                String result = isPrime(num) ? "Prime" : "Composite";
                System.out.println(result);
                break;
            case 4:
                System.out.println("You are given a number “n”, write the program using recursion for\n" +
                        "finding “n!”");
                System.out.println("write your number: ");
                int fact = sc.nextInt();
                System.out.println(findFactorial(fact));
                break;
            case 5:
                System.out.println("You are given a number “n”, write the function for finding n-th\n" +
                        "elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).\n" +
                        "F0= 0, F1 = 1.");
                System.out.println("write your number: ");
                int fib = sc.nextInt();
                System.out.println(findFibonacci(fib));
                break;
            case 6:
                System.out.println("You are given numbers “a” and “n”, write the function that\n" +
                        "returns “a in n-th power" +
                        "”. ");
                System.out.println("write your base number: ");
                int base = sc.nextInt();
                System.out.println("write your power number: ");
                int power = sc.nextInt();
                System.out.println(findPower(base, power));
                break;
            case 7:
                System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                        "write the program that returns given array in reverse order\n" +
                        "without using array data structure.");
                System.out.println("write size of your array: ");
                size = sc.nextInt();
                int [] arr2 = new int[size];
                System.out.println("write all number of your array: ");
                for (int i = 0; i < size; i++) {
                    arr2[i] = sc.nextInt();
                }
                System.out.println(returnReversedArray(size, arr2));
                break;
            case 8:
                System.out.println("You are given a string “s”, write the function for checking\n" +
                        "whether “s” is all consists of digits.");
                System.out.println("write your string: ");
                sc.nextLine();
                String str = sc.nextLine();
                result = isFullDigits(str) ? "Yes" : "No";
                System.out.println(result);
                break;
            case 9:
                System.out.println("You are given numbers“n” and “k”,write the program that\n" +
                        "finds binomial coefficient");
                System.out.println("write first coefficient: ");
                int coeff1 = sc.nextInt();
                System.out.println("write second coefficient");
                int coeff2 = sc.nextInt();
                System.out.println(findBinomialCoefficient(coeff1, coeff2));
                break;
            case 10:
                System.out.println("You are given “a” and “b”, write the function for finding\n" +
                        "GCD(a, b) using recursion.");
                System.out.println("write first coefficient: ");
                coeff1 = sc.nextInt();
                System.out.println("write second coefficient");
                coeff2 = sc.nextInt();
                System.out.println(findGCD(coeff1, coeff2));
                break;
        }

    }

    public static int findMinInArray(int size, int[] arr) {
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }

    public static double findAverageInArray(int size, int[] arr) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum / size;
    }

    public static boolean isPrime (int num) {
        if (num > 1){
            for (int i = 2; i < num / 2 ; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static int findFibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1){
            return 1;
        }
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
    public static int findPower(int a, int n) {
        if (n == 1) {
            return a;
        } else if (n == 0) {
            return 1;
        }
        return a * findPower(a, n - 1);
    }

    public static String returnReversedArray(int size, int[] arr) {
        if (size == 1) {
            return Integer.toString(arr[0]);
        }
        return arr[size - 1] + " " + returnReversedArray(size - 1, arr);
    }

    public static boolean isFullDigits(String str) {
        if (str.isEmpty()) {
            return true;
        } else if (!Character.isDigit(str.charAt(0))) {
            return false;
        }
        return isFullDigits(str.substring(1));
    }

    public static int findBinomialCoefficient(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
    }

    public static int findGCD(int n, int k) {
            if (k == 0) {
                return n;
            }
            return findGCD(k, n % k);
    }
}
