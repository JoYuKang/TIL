package todaytest;

import java.util.Scanner;

public class BaekJoon11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                num = num / i;
                System.out.println(i);
                i = 1;
            }
            i++;
        }
    }
}
