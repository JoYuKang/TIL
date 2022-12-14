package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {
    static int count = 0;
    static int[][] graph = new int[8][8];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList();
        q.add(new Point(x, y));
        while (!q.isEmpty()) {
            Point target = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = target.x + dx[i];
                int ny = target.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1;
                    q.add(new Point(nx, ny));
                    graph[nx][ny] = graph[target.x][target.y] + 1;
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

        BFS(1, 1);
        if (graph[7][7] == 0) {
            System.out.println(-1);
        }else {
            System.out.println(graph[7][7]);
        }
    }
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
