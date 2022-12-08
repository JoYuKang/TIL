package dfs;

import java.util.Scanner;

public class 바둑이_승차 {
    static int maxNum = 0;
    static int maxW;

    static void DFS(int depth, int sum, int[] peopleW) {
        if (maxW < sum){
            return;
        }
        if (depth == peopleW.length) {
            maxNum = Math.max(sum, maxNum);
        }else {
            DFS(depth + 1, sum + peopleW[depth], peopleW);
            DFS(depth + 1, sum, peopleW);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxW = sc.nextInt();
        int peopleNum = sc.nextInt();
        int[] peopleW = new int[peopleNum];

        for (int i = 0; i < peopleNum; i++) {
            peopleW[i] = sc.nextInt();
        }

        DFS(0, 0, peopleW);
        System.out.println(maxNum);
    }
}
