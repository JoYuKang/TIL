package todaytest;

import java.util.Arrays;

public class Pro_입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        System.out.println(solution(n, times));
    }

    static public long solution(int n, int[] times) {
        Arrays.sort(times);
        return Binary(times,n,times[times.length-1]);
    }

    static public long Binary(int[] times, int n, long max) {
        long left = 1;
        long right = max * n;
        long mid;
        long answers = Long.MAX_VALUE;
        while (left <= right) {
            mid = (left + right) / 2;
            if (isPassed(times, n, mid)) {
                answers = Math.min(answers, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answers;
    }

    static boolean isPassed(int[] times, int n, long mid) {
        long amount = 0;
        for (int i = 0; i < times.length; i++) {
            amount += mid / times[i];
        }
        if (amount >= n) {
            return true;
        } else {
            return false;
        }
    }
}
