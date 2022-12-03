package stack;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                int rt = stack.pop();
                int lt = stack.pop();
                if (str.charAt(i) == '+') {
                    stack.push(lt + rt);
                }
                else if (str.charAt(i) == '-') {
                    stack.push(lt - rt);
                }
                else if (str.charAt(i) == '/') {
                    stack.push(lt / rt);
                }
                else if (str.charAt(i) == '*') {
                    stack.push(lt * rt);
                }
            }else{
                stack.push(str.charAt(i) - 48);
            }
        }

        System.out.println(stack.pop());

    }
}
