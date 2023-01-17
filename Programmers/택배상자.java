package pro;

import java.util.Stack;

public class 택배상자 {
    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int p1 = 0;
        for (int i = 1; i <= order.length; i++) {
            if (order[p1] == i) {
                answer++;
                p1++;
            }
            else {
                if (stack.empty()) {
                    stack.add(i);
                    continue;
                }
                while (!stack.isEmpty()) {
                    if (stack.peek() == order[p1] && p1 < order.length) {
                        stack.pop();
                        answer++;
                        p1++;
                    }else {
                        break;
                    }
                }
                stack.add(i);
            }
        }
        while (!stack.isEmpty()){
            if (order[p1] == stack.pop()) {
                answer++;
                p1++;
                if (p1 == order.length) {
                    break;
                }
            } else {
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] order = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        System.out.println(solution(order));
    }
}
