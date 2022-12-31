package twopointers;

import java.util.Scanner;

public class 최대_길이_연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = 0;
        int arrLen = sc.nextInt();
        int count = sc.nextInt();
        int[] arr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        int answer = 0;
        for (int p2 = 0; p2 < arrLen; p2++) {
            if (arr[p2] == 0) {
                num++;
            }
            while (num > count) {
                if (arr[p1] == 0) {
                    num--;
                }
                p1++;
            }
            answer = Math.max(answer, p2 - p1 + 1);
        }
        System.out.println(answer);
    }
}
