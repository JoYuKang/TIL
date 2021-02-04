package todaytest;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row = sc.nextInt();
        int[] pack = new int[row];
        int[] piece = new int[row];

        for (int i = 0; i < row; i++) {
            pack[i] = sc.nextInt();
            piece[i] = sc.nextInt();
        }
        Arrays.sort(pack);
        Arrays.sort(piece);
        int min = 9999;
        // ALL 가장 싼 6개 묶음 구매 vs ALL 가장 싼 낱개 구매 vs (가장싼 6개짜리  n팩 + 낱개)
        min = Math.min(((num / 6) + 1) * pack[0], num * piece[0]);
        min = Math.min(min, ((num / 6)) * pack[0] + (num % 6) * piece[0]);

        System.out.println(min);
    }

}
