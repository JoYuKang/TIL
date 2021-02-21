package todaytest;

import java.util.Arrays;

public class pro행렬의곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }

    static public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int count = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    count += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = count;
            }
        }
        return answer;
    }
}
