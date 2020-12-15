package todaytest;

import java.util.Arrays;

public class Pro_x만큼간격 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(solution(x, n)));
    }

    static public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (long i = 1; i <= n; i++) {

            answer[(int) (i - 1)] = x * i;

        }
        return answer;
    }
}
