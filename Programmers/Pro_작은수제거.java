package todaytest;

import java.util.ArrayList;

public class Pro_작은수제거 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(solution(arr));
    }

    static public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = arr[0];
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer.add(arr[i]);
                }
            }
        } else {
            answer.add(-1);
        }
        return answer;
    }
}
