package dynamic;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Scanner;

public class 최대부분증가수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int[] answerArr = new int[num];
        answerArr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && answerArr[j] > max) {
                   max = answerArr[j];
                }
            }
            answerArr[i] = max + 1;
        }
        System.out.println(Arrays.stream(answerArr).max().getAsInt());
    }
}
