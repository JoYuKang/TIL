package stack;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        String answer = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '(') {
//                stack.add(str.charAt(i));
//                continue;
//            } else if (str.charAt(i) == ')' && !stack.empty()) {
//                stack.pop();
//                continue;
//            }
//            if (stack.empty()) {
//                answer += str.charAt(i);
//            }
//        }
        // ------ refactor ------
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                while (stack.pop() != '(') {
                }
            }
            else {
                stack.push(str.charAt(i));
            }
        }
        for (Character character : stack) {
            answer += character;
        }


        System.out.println(answer);
    }
}
