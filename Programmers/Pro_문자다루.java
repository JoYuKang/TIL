package todaytest;

public class Pro_문자다루 {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

    static public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    answer = false;
                    break;
                }
            }
        }else{
            answer=false;
        }
        return answer;
    }
}
