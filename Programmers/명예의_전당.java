package pro;

import java.util.PriorityQueue;

public class 명예의_전당 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            if (i >= answer.length) {
                break;
            }
            queue.add(score[i]);
            answer[i] = queue.peek();
        }

        for (int i = k; i < score.length; i++) {
            if (i > answer.length) {
                break;
            }
            if (score[i] > queue.peek()) {
                queue.poll();
                queue.add(score[i]);
            }
            answer[i] = queue.peek();
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 9;
        int[] score = {10, 30, 40, 3, 0, 20, 4};
        System.out.println(solution(k, score));
    }
}
