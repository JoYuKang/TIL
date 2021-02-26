package todaytest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1697 {
    static int visit[]; // 방문여부
    static int str;
    static int end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextInt();
        end = sc.nextInt();
        visit = new int[100001];

        if (str == end) {
            System.out.println(0);
        } else {
            bfs(str);
        }
    }

    static void bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        visit[num] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == end) {
                    System.out.println(visit[temp]);
                    return;
                }

                if (next >= 0 && next < visit.length && visit[next] == 0) {
                    q.add(next);
                    visit[next] = visit[temp] + 1;
                }
            }
        }
    }
}
