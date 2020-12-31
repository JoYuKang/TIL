package todaytest;

import java.util.Scanner;

public class BaekJoon2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = {0, 0};
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                answer[0] = i;
            }
        }
        answer[1] = a * b / answer[0];
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
//    int[] num = new int[2];
//    int[] answer = {0, 0};
//        num[0] = sc.nextInt();
//                num[1] = sc.nextInt();
//                Arrays.sort(num);
//                for (int i = num[0]; i >= 2; i--) {
//                if (num[0] % i == 0 && num[1] % i == 0) {
//                answer[0] = i;
//                break;
//                }
//                }
//                answer[1] = num[0] * num[1] / answer[0];
//                System.out.println(answer[0]);
//                System.out.println(answer[1]);