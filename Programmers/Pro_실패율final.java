package todaytest;

import java.util.Arrays;
import java.util.HashMap;

public class Pro_실패율final {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    static public int[] solution(int N, int[] stages) {
        int[] remain = new int[N + 1];
        int[] pass = new int[N];
        for (int stage : stages) {
                remain[stage - 1]++; // remain[stages[i]-1]++;
            for (int j = 0; j < stage - 1; j++) {
                pass[j]++;
            }
        }
        /*
        for(int i=0; i<stages.length;i++) {
            remain[stages[i]-1]++;
            for(int j =0; j<stages[i]-1; j++) {
                pass[j]++;
            }
        }
         */
        double[] fail = new double[N];
        for (int i = 0; i < N; i++) {
            if (pass[i] == 0 && remain[i] == 0) {
                fail[i] = 0;
            } else
                fail[i] = (double) remain[i] / (double) pass[i];
        }

        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        for (int i = 0; i < N; i++) {
            map.put(i + 1, fail[i]);
        }
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxkey = 0;
            for (Integer key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    maxkey = key;
                }
            }
            answer[i] = maxkey;
            map.remove(maxkey);
        }


        return answer;
    }
}
