package todaytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pro_문자열내맘대로정렬 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(solution(strings, n)));
    }

    static public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        // ArrayList 사용
        ArrayList<String> arr = new ArrayList<String>();

        for (int i=0; i<strings.length; i++) {
            arr.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);

        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i).substring(1);
        }

        return answer;
    }
}
