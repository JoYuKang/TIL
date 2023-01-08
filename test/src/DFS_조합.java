package dfs;

import java.util.Scanner;

public class DFS_조합 {
    static int[][] memory;
    static int DFS(int depth, int rl) {
        if (memory[depth][rl] != 0) {
            return memory[depth][rl];
        }
        if (depth == rl || rl == 0) {
            return 1;
        }else{
            return memory[depth][rl] = DFS(depth - 1, rl - 1) + DFS(depth - 1, rl);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int len = sc.nextInt();
        memory = new int[num + 1][len + 1];
        System.out.println(DFS(num, len));
    }
}
