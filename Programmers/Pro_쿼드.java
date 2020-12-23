package todaytest;

import java.util.Arrays;

public class Pro_쿼드 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static public int[] solution(int[][] arr) {
        int[] answer = {0, 0};
        int num = arr.length;
        for (int[] ints : arr) {
            for (int j = 0; j < num; j++) {
                if (ints[j] == 0) answer[0]++;
                else if (ints[j] == 1) answer[1]++;
            }
        }
        boolean[][] v = new boolean[num][num];
        for (int n = num; n > 1; n /= 2) {// 쪼개는 크기를 알려줌, 4->2->1
            for (int i = 0; i < num; i += n) { //      0
                for (int j = 0; j < num; j += n) { //  0
                    if (v[i][j]) continue;
                    int flag = arr[i][j];
                    int a = i, b = j;
                    loop:
                    for (a = i; a < i + n; a++) {
                        for (b = j; b < j + n; b++) {
                            if (flag != arr[a][b]) break loop;
                        }
                    }
                    if (a == i + n && b == j + n) {
                        for (a = i; a < i + n; a++) {
                            for (b = j; b < j + n; b++) {
                                v[a][b] = true;
                            }
                        }
                        answer[flag] -= n * n;
                        answer[flag]++;
                    }
                }
            }
        }
        return answer;
    }
}
