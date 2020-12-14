package todaytest;

import java.util.Arrays;
import java.util.Collections;

public class Pro_정수내림차순 {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

    static public Long solution(long n) {

        String s = String.valueOf(n);

        String[] ans = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[i] = String.valueOf(s.charAt(i));
        }
        s = "";
        Arrays.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < ans.length; i++) {
            s += ans[i];
        }
        return Long.parseLong(s);
    }
}
