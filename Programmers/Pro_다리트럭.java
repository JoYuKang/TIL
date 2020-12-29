package todaytest;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_다리트럭 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution(bridge_length,weight,truck_weights));
    }

    static public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length;
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        for (int truck_weight : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.add(truck_weight);
                    sum += truck_weight;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if (sum + truck_weight > weight) {
                        answer++;
                        q.add(0);
                    } else {
                        q.add(truck_weight);
                        sum += truck_weight;
                        answer++;
                        break;
                    }
                }

            }

        }


        return answer;
    }
}
