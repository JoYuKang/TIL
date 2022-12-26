package pro;

import java.util.*;

public class 디펜스_게임 {

    public static int solution(int n, int k, int[] enemy) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int sum = n;
        int perfectDefense = k;
        for (int i = 0; i < enemy.length; i++) {
            sum -= enemy[i];
            q.add(enemy[i]);
            if (sum < 0) {
                sum += q.poll();
                if (perfectDefense == 0) {
                    return answer;
                }
                perfectDefense--;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1}));
    }
}
