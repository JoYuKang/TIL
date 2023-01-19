package tomorrow;

import java.util.Scanner;

public class BaekJoon2573 {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] arr;
    static int x, y;
    static boolean[][] visited;
    static int[][] melt;
    static void DFS(int ix, int iy) {
        visited[ix][iy] = true;
        for (int i = 0; i < 4; i++) {
            int nx = ix + dx[i];
            int ny = iy + dy[i];
            if (nx >= 0 && ny >= 0 && nx < x && ny < y) {
                if (arr[nx][ny] == 0) {
                    melt[ix][iy]++;
                    continue;
                }
                if (!visited[nx][ny]) {
                    DFS(nx, ny);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        arr = new int[x][y];
        visited = new boolean[x][y];
        melt = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int year = 0;
        while (true) {
            answer = 0;
            visited = new boolean[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (arr[i][j] != 0 && !visited[i][j]) {
                        DFS(i, j);
                        answer++;
                    }
                }
            }
            if (answer == 0) {
                System.out.println(0);
                break;
            }
            if (answer >= 2) {
                System.out.println(year);
                break;
            }

            melting();
            year++;

        }
    }
    public static void melting() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = arr[i][j] - melt[i][j];
                melt[i][j] = 0;
                if (arr[i][j] < 0) {
                    arr[i][j] = 0;
                }
            }
        }

    }

}
