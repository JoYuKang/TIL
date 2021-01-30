package todaytest;

import java.util.Scanner;

public class BaekJoon1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num >= 5) { // 5의 배수마다 0의 카운트 값이 증가
            count += num / 5;
            num /= 5;
        }
        System.out.println(count);
    }
}
