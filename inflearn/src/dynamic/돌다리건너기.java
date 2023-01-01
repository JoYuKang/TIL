package dynamic;

import java.util.Scanner;

public class 돌다리건너기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[36];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        for (int i = 3; i <= 35; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[num + 1]);
    }
}
