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
                long startTime = System.nanoTime();
                System.out.println("runtime: "+(double)(System.nanoTime() - startTime)/1000000000+
                        "\ntime complexity: O(n)");
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

    /* Method to find minimum element in an array
    Time complexity: O(n), where n is input number.
    The method iterates through each element of the array once to find the minimum value.
    @param size The number of the size of the array,
    arr The array sent to a method
    @return The minimum element of the array found
     */
    public static int findMinInArray(int size, int[] arr) {
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            // Check each element of the array to find the minimum
            if (arr[i] < minNum) {
                minNum = arr[i]; // Update minimum if the current element is smaller
            }
        }
        return minNum; // Return the minimum element found
    }

    /* Method to find average of elements in an array
    Time complexity: O(n), where n is input number.
    The method iterates through each element of the array once to calculate the sum of all elements.
    @param size The number of the size of the array,
    arr The array sent to a method
    @return The average element of the array found
     */
    public static double findAverageInArray(int size, int[] arr) {
        double sum = 0;
        // Calculate the sum of all elements in the array
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        // Calculate and return the average by dividing the sum by the size
        return sum / size;
    }

    /* Method to check if a number is prime
    Time complexity: O(n/ 2), where n is the input number.
    In the isPrime method, we check divisibility of the input number num by iterating
    from 2 to the half of num (num / 2).
    @param num The number to check if it is prime or not
    @return True or false
     */
    public static boolean isPrime(int num) {
        if (num > 1) {
            // Iterate from 2 to num/2 to check if num is divisible by any number
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    return false; // If divisible, num is not prime
                }
            }
            return true; // If not divisible by any number, num is prime
        } else {
            return false; // 0 and 1 are not prime numbers
        }
    }

    /* Method to find factorial of a number
    Time complexity: O(n), where n is the input number.
    The method recursively calls itself n times, each time reducing
    the value of n by 1 until it reaches the base case (n = 0).
    @param n The number for which the factorial is to be found
    @return Factorial of the number
     */
    public static int findFactorial(int n) {
        if (n == 0) {
            return 1; // factorial of 0 is 1
        }
        // Recursive call to find factorial of n-1, then multiply with n
        return n * findFactorial(n - 1);
    }

    /* Method to find Fibonacci number
    Time complexity: O(2^n), where n is input number.
    Each recursive call results in two additional recursive calls, one for
    findFibonacci(num - 1) and one for findFibonacci(num - 2).
    @param num The n-th number of the Fibonacci sequence to find
    @return The number of the Fibonacci sequence
     */
    public static int findFibonacci(int num) {
        if (num == 0) {
            return 0; // Fibonacci(0) is 0
        } else if (num == 1) {
            return 1; // Fibonacci(1) is 1
        }
        // Recursive call to find Fibonacci(num-1) and Fibonacci(num-2), then sum them
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
    /* Method to find power of some number
    Time complexity: O(n), where n is the input number.
    Each recursive call results in a reduction of the exponent n by 1 until it reaches the base case (n = 1).
    @param a The base of the power number
    n The number to raise a base to
    @return number to a n-th power
     */
    public static int findPower(int a, int n) {
        if (n == 1) {
            return a; // a^1 is a
        } else if (n == 0) {
            return 1; // a^0 is 1
        }
        // Recursive call to find a^(n-1), then multiply with a
        return a * findPower(a, n - 1);
    }

    /* Method to reverse an array
    Time complexity: O(n), where n is the input number.
    In each recursive call, it handles one element of the array.
    @param size The number of the size of the array,
    arr The array sent to a method
    @return Reversed array
     */

    public static String returnReversedArray(int size, int[] arr) {
        if (size == 1) {
            return Integer.toString(arr[0]); // Single element array, return its value
        }
        // Recursive call to reverse the remaining elements of the array and append the current element
        return arr[size - 1] + " " + returnReversedArray(size - 1, arr);
    }

    /* Method to check if a string consists only of digits
    O(n), where n is the input number.
    In each recursive call, it checks one character of the string.
    @param str The string to check if it is full digits
    @return True or false
     */

    public static boolean isFullDigits(String str) {
        if (str.isEmpty()) {
            return true; // Empty string, return true
        } else if (!Character.isDigit(str.charAt(0))) {
            return false; // Non-digit character found, return false
        }
        // Recursive call to check the remaining characters of the string
        return isFullDigits(str.substring(1));
    }

    /* Method to compute the binomial coefficient
    Time complexity: O(2^n), where n is the input number
    Each recursive call results in two additional recursive calls, one for
    findBinomialCoefficient(n - 1, k - 1) and one for findBinomialCoefficient(n - 1, k).
    @param n The first coefficient of binomial coefficient
    k The second one
    @result The result of binomial coefficient
     */
    public static int findBinomialCoefficient(int n, int k) {
        if (k == 0 || n == k) {
            return 1; // C(n, 0) and C(n, n) are both 1
        }
        // Recursive call to compute C(n-1, k-1) and C(n-1, k), then sum them
        return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
    }

    /* Method to find the greatest common divisor (GCD) using recursion (Euclidean Algorithm)
    Time complexity: O(log(a, b)), where a and b are input numbers
    @param n The first number of GCD to find
    k The second one
    @result the GCD of two numbers
     */

    public static int findGCD(int n, int k) {
        if (k == 0) {
            return n; // If k is 0, then n is the GCD
        }
        // Recursive call with arguments (k, n % k)
        return findGCD(k, n % k);
    }
}
