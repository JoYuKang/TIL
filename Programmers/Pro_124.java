package todaytest;

public class Pro_124 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(solution(n));
    }

    static public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] numbers = {"4", "1", "2"};
        while (n > 0) {
            int remainder = n % 3;
            n /= 3;

            if (remainder == 0) {
                n--;
            }

            answer.insert(0, numbers[remainder]);
        }

        return answer.toString();
    }
}
