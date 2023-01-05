package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class 친구인가_B {
    static int[] unf;

    static int find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int num = sc.nextInt();
        unf = new int[people + 1];

        for (int i = 1; i <= people; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < num; i++) {
            int friend1 = sc.nextInt();
            int friend2 = sc.nextInt();
            union(friend1, friend2);
        }

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int check1 = find(num1);
        int check2 = find(num2);
        if (check1 == check2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
