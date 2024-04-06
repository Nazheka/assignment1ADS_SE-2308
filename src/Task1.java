import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(FindMinOfArray(size, arr));
    }

    public static int FindMinOfArray(int size, int[] arr) {
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }
}
