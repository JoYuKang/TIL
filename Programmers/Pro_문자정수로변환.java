package todaytest;

public class Pro_문자정수로변환 {
    public static void main(String[] args) {
        String s = "-1234";
        System.out.println(solution(s));
    }

    static public int solution(String s) {
        int answer = Integer.parseInt(s);

        return answer;
    }
}
