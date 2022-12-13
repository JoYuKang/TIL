package dfs;

import java.util.Scanner;

public class 수열_추측하기 {

    static int n, f;
    static int[] b, p, ch;
    static int[][] dy = new int[35][35];

    static boolean flag = false;

    static int combi(int depth, int rl) {
        if (dy[depth][rl] != 0) {
            return dy[depth][rl];
        }
        if (depth == rl || rl == 0) {
            return 1;
        }else{
            return dy[depth][rl] = combi(depth - 1, rl - 1) + combi(depth - 1, rl);
        }
    }

    public static void DFS(int depth, int sum) {
        if (flag) {
            return;
        }
        if (depth == n) {
            if (sum == f) {
                for (int i : p) {
                    System.out.print(i + " ");
                    flag = true;
                }
            }
        }else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[depth] = i;
                    DFS(depth + 1, sum + (p[depth] * b[depth]));
                    ch[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];

         for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        DFS(0, 0);
    }
}
