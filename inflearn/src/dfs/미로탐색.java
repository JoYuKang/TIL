package dfs;

import java.util.Scanner;

public class 미로탐색 {
    static int count = 0;
    static int[][] graph = new int[8][8];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static void DFS(int n, int m) {
        if (n == 7 && m == 7) {
            count++;
        }else{
            for (int i = 0; i < 4; i++) {
                int nx = n + dx[i];
                int ny = m + dy[i];
                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1;
                    DFS(nx, ny);
                    graph[nx][ny] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        DFS(1, 1);
        System.out.println(count / 2);
    }
}
