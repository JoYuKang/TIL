package twopointers;

import java.util.Scanner;

public class 연속부분수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[arrLen];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int p1 = 0;
        int sum = 0;
        int answer = 0;
        for (int p2 = 0; p2 < arrLen; p2++) {
            sum += arr[p2];
            if (sum == target) {
                answer++;
            }
            while (sum >= target) {
                sum -= arr[p1++];
                if (sum == target) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

}
