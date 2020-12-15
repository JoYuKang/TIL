package todaytest;

public class Pro_정수제곱근 {
    public static void main(String[] args) {
        long n = 5476;
        System.out.println(solution(n));
    }

    static public long solution(long n) {
        long answer = 0;
        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            } else answer = -1;
        }
        return answer;
    }
}
