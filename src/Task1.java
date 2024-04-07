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
        }
        else {
            return false;
        }
    }

}
