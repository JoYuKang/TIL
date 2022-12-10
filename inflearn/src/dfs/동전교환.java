package dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    static int num;
    static Integer[] arr;
    static int target;
    static int minNum = Integer.MAX_VALUE;

    public static void DFS(int count, int sum){
        if (sum > target) {
            return;
        }
        if (count > minNum) {
            return;
        }
        if (target == sum) {
            minNum = Math.min(minNum, count);
        } else {
            for (int i = 0; i < num; i++) {
                DFS(count + 1, sum + arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new Integer[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        target = sc.nextInt();
        DFS(0, 0);
        System.out.println(minNum);
    }
}
