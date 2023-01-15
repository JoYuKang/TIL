package pro;

public class 마법의_엘리베이터 {

    public static int solution(int storey) {
        int answer = 0;
        while (storey != 0) {
            int num = storey % 10;
            if (num >= 6) {
                answer += 10 - num;
                storey = storey / 10 + 1;
            } else if (num == 5) {
                int nextNum = storey / 10 % 10;
                answer += 5;
                storey = storey / 10;
                if (nextNum == 9 || nextNum == 5) {
                    storey++;
                }
            } else {
                answer += num;
                storey = storey / 10;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        System.out.println(solution(2554));
    }
}
