package Pro;

import java.util.Arrays;

public class Pro_문자열내림차순으로정렬 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    static public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        Arrays.sort(ch);
        for (int i = ch.length - 1; i >= 0; i--) {
            answer.append(ch[i]);
        }
        return answer.toString();
    }
}
