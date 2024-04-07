import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose task (1-10):");
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
}
