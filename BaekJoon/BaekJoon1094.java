package todaytest;

import java.util.Scanner;

public class BaekJoon1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 64;
        int cnt = 0;
        while (num > 0) {

            if (count > num) {
                count /= 2;
            } else {
                cnt++;
                num -= count;
            }
        }
        System.out.println(cnt);

    }
}
