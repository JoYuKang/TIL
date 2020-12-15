package todaytest;

public class Pro_짝수와홀수 {
    public static void main(String[] args) {
        int num = -5;
        System.out.println(solution(num));
    }

    static public String solution(int num) {
        String answer = "";

        if (num % 2 == 1 || num % 2 == -1) {
            answer = "Odd";
        } else {
            answer = "Even";
        }
        return answer;
    }
}
