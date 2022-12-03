package stack;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }else {
                if (str.charAt(i - 1) == '(') {
                    stack.pop();
                    answer += stack.size();
                }else{
                    stack.pop();
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
