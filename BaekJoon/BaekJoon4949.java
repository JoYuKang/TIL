package todaytest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals(".")){
                break;
            }
            boolean chk = true;
            Stack<Character> ch = new Stack<Character>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '(' || c == '[') {
                    ch.add(c);
                } else if (c == ')') {
                    if (!ch.isEmpty()&& ch.pop() == '(') {
                    } else {
                        chk = false;
                        break;
                    }
                } else if (c == ']') {
                    if (!ch.isEmpty() && ch.pop() == '[') {
                    } else {
                        chk = false;
                        break;
                    }
                }
            }
            if (chk && ch.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
//        while (true) {
//            Stack<Character> ch = new Stack<>();
//            String answer = "yes";
//            String a = br.readLine();
//            if (a.equals(".")) {
//                break;
//            }
//
//            for (int i = 0; i < a.length(); i++) {
//                if (a.charAt(i) == '(') {
//                    ch.add(a.charAt(i));
//                } else if (a.charAt(i) == ')') {
//                    if (ch.isEmpty() || !ch.contains('(')) {
//                        answer = "no";
//                        break;
//                    }
//                    ch.removeElement('(');
//                } else if (a.charAt(i) == '[') {
//                    ch.add(a.charAt(i));
//                } else if (a.charAt(i) == ']') {
//                    if (ch.isEmpty() || !ch.contains('[')) {
//                        answer = "no";
//                        break;
//                    }
//                    ch.removeElement('[');
//                }
//            }
//            System.out.println(answer);
//
//        }

    }
}
