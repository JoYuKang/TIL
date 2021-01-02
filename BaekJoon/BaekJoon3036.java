package todaytest;

import java.util.Scanner;

public class BaekJoon3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            int n = 1;
            for (int j = arr[i]; j >= 2; j--) {
                if (arr[0] % j == 0 && arr[i] % j == 0) {
                    n = j;
                    break;
                }
            }
            System.out.println(arr[0] / n + "/" + arr[i] / n);
        }
    }
}
