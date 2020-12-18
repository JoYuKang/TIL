package todaytest;

public class Pro_대진표 {
    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;
        System.out.println(solution(n, a, b));
    }

    static public int solution(int n, int a, int b) {
        int answer = 0;
        while (a != b) {
            if (a % 2 == 1) {
                a = a / 2 + 1;
            } else {
                a = a / 2;
            }
            if (b % 2 == 1) {
                b = b / 2 + 1;
            } else {
                b = b / 2;
            }
            answer++;
        }


        return answer;
    }
}
