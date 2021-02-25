package todaytest;

import java.util.Scanner;


public class BaekJoon15651 {
    static public int N, M;
    // static public boolean[] visit; 자기 자신도 나와야 해서 방문 표시 x
    static public int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        //방문처리
    //    visit = new boolean[N + 1];
        //개수만큼 출력할 값 담음
        arr = new int[M];
        dfs(0);
        System.out.println(sb);

    }


    public static void dfs(int d) {
        // 깊이가 M이랑 같아지면 출력후 return
        if (d == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i] + " ");
                // System.out.println(arr[i]+" ");
                // 사용시 시간 초과
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[d] = i;
            dfs(d + 1);
        }
    }

}
