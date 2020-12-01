package Pro;

import java.util.LinkedList;
import java.util.Queue;

public class Correct_parenthesis {
    public static void main(String[] args) {
        String s = "(())()";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;
        char st = '(';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (st == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                answer = false;
                break;
            }
        }
        if(count!=0){
            answer = false;
        }


        return answer;
    }
}
