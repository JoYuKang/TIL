package twopointers;

import java.util.Scanner;

public class 연속부분수열_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[arrLen];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int p1 = 0;
        int p2 = 1;
        int sum = 0;
        int answer = 0;
        while (p1 < arrLen && p2 < arrLen) {
            if (sum < target) {
                sum += arr[p2];
                p2++;
            }else{
                if (sum == target) {
                    answer++;
                }
                sum -= arr[p1];
                p1++;
            }
        }
        System.out.println(answer);
    }
}
