package todaytest;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon1904 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Cal = new int[N + 1];
        Cal[1] = 1;
        if (N != 1) Cal[2] = 2;
        for (int i = 3; i < N + 1; i++) {
            Cal[i] = (Cal[i - 2] + Cal[i - 1]) % 15746;
        }
        System.out.println(Cal[N]);
    }
}
