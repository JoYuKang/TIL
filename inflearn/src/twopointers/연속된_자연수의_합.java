package twopointers;

import java.util.Scanner;

public class 연속된_자연수의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int answer = 0;

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }

        while (p1 < num && p2 < num) {
            if (sum < num) {
                sum += arr[p2++];
            }else {
                if (sum == num) {
                    answer++;
                }
                sum -= arr[p1++];
            }
        }
        System.out.println(answer);

    }
}
