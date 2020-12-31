package todaytest;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        Arrays.sort(a);
        System.out.println(a[0] * a[num - 1]);
    }
}
