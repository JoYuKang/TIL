package todaytest;

public class Pro_콜라츠 {
    public static void main(String[] args) {
        int num = 626331;
        System.out.println(solution(num));
    }

    static public int solution(int num) {
        int answer = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            answer++;
            if (answer > 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
