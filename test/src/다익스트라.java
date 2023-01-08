package pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 다익스트라 { // 배달

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        ArrayList<ArrayList<Edge>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        int[] costs = new int[N + 1];
        Arrays.fill(costs, Integer.MAX_VALUE);
        PriorityQueue<Edge> q = new PriorityQueue<>();

        for (int[] ints : road) {
            // 양방향
            //      현재위치            목표위치            비용
            list.get(ints[0]).add(new Edge(ints[1], ints[2]));
            list.get(ints[1]).add(new Edge(ints[0], ints[2]));
        }

        costs[1] = 0;
        q.offer(new Edge(1, 0));

        while (!q.isEmpty()) {
            Edge nowEdge = q.poll();
            int nowPoint = nowEdge.point;
            int nowCost = nowEdge.cost;
            if (nowCost > costs[nowPoint]) {
                continue;
            }
            for (Edge edge : list.get(nowPoint)) {
                if (costs[edge.point] > nowCost + edge.cost) {
                    costs[edge.point] = nowCost + edge.cost;
                    q.add(new Edge(edge.point, costs[edge.point]));
                }
            }
        }

        for (int i = 1; i < costs.length; i++) {
            if (costs[i] <= K) {
                answer++;
            }
        }


        return answer;
    }

    public static class Edge implements Comparable<Edge> {
        int point;
        int cost;

        Edge(int point, int cost) {
            this.point = point;
            this.cost = cost;
        }


        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
        System.out.println(solution(5, arr, 3));
    }
}
