package dfs;

import java.util.Scanner;

public class 합이_같은_부분집합 {
    static String answer = "NO";
    static int total = 0;
    static boolean flag = false;
    static int n;
    public static void dfs(int index, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (sum > total / 2) {
            return;
        }
        if (n == index) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(index + 1, sum + arr[index], arr);
            dfs(index + 1, sum, arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        dfs(0, 0, arr);
        System.out.println(answer);


    }


}
