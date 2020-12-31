package todaytest;

import java.util.Scanner;

public class BaekJoon11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 1;
        int num = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }

        for (int i = 1; i <= a - b; i++) {
            num *= i;
        }
        for (int i = 1; i <= b; i++) {
            num *= i;
        }

        System.out.println(sum / num);
    }
}
