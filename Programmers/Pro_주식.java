package todaytest;

import java.util.Arrays;
import java.util.Stack;

public class Pro_주식 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
    }

    static public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                } else if (j == prices.length - 1) {
                    answer[i] = j - i;
                }
            }
        }

        return answer;
    }
}
