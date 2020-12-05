package BaekJoonTest;

import java.util.Scanner;

class BaekJoon10974_final {
    static int N;
    static int arr[];
    static int out[];
    static boolean visit[];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        out = new int[N];
        visit = new boolean[N];
        for(int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        permutation(0);

    }
    public static void permutation(int depth) {
        if(depth == N) {
            for(int i = 0; i < N; i++) {
                System.out.print(out[i]+ " ");
            }
            System.out.println();

        }

        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                out[depth] = arr[i];
                permutation(depth+1);
                visit[i] = false;
            }
        }

    }

}