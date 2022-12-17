package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {

    static int x, y;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] graph, answer;
    static Queue<Point> queue = new LinkedList<>();
    static void BFS() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && nx < x && ny >= 0 && ny < y && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1;
                    queue.add(new Point(nx, ny));
                    answer[nx][ny] = answer[point.x][point.y] + 1;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        x = sc.nextInt();
        graph = new int[x][y];
        answer = new int[x][y];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 1) {
                    queue.add(new Point(i, j));
                }
            }
        }
        BFS();
        boolean flag = true;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 0) {
                    flag = false;
                }
            }
        }
        int maxnum = Integer.MIN_VALUE;
        if (flag) {
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[i].length; j++) {
                    maxnum = Math.max(answer[i][j], maxnum);
                }
            }
            System.out.println(maxnum);
        }else {
            System.out.println(-1);
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
