package dfs;

import java.util.Scanner;

public class 섬나라 {

    static int num;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static int[][] arr, visited;
    class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y= y;
        }

    }

    static void DFS(int x, int y) {
        if (visited[x][y] == 1) {
            return;
        }
        visited[x][y] = 1;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < num && ny < num && arr[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arr = new int[num][num];
        visited = new int[num][num];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1 && visited[i][j] == 0) {
                    count++;
                    DFS(i,j);
                }
            }
        }
        System.out.println(count);
    }
}
