package src.array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 봉우리 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int  num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
    public static int solution(int[][] arr){
        int answer = 0;
        boolean flag = true;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx < 0 || ny < 0 || nx >= num || ny >= num) {
                        continue;
                    }
                    if (arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
