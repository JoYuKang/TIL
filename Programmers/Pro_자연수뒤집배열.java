package todaytest;

import java.util.Arrays;

public class Pro_자연수뒤집배열 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }

    static public int[] solution(long n) {

        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1 - i)));
        }
        return answer;
    }
}
