package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 원더랜드 {
    static class Edge{
        int v1;
        int v2;
        int cost;

        Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
    }
    static int[] unf;

    static int find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = sc.nextInt();
        int answer = 0;
        ArrayList<Edge> list = new ArrayList<>();
        unf = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            unf[i] = i;
        }
        for (int i = 0; i < count; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            list.add(new Edge(start, end, cost));
        }
        Collections.sort(list, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.cost - o2.cost;
            }
        });

        for (Edge edge : list) {
            int start = find(edge.v1);
            int end = find(edge.v2);
            if (start == end) {
                continue;
            }
            answer += edge.cost;
            union(edge.v1, edge.v2);

        }

        for (int i = 1; i < num; i++) {
            int temp = Integer.MAX_VALUE;

        }

        System.out.println(answer);


    }
}
