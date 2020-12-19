package todaytest;

import java.util.Stack;

public class Pro_짝지어제거 {
    public static void main(String[] args) {
        String s = "cdcd";
        System.out.println(solution(s));
    }
    static public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for(char c : s.toCharArray())
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);

            if(stack.isEmpty()){
                answer=1;
            }

        return answer;

    }
}
