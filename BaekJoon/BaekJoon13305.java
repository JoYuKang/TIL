package todaytest;

import java.util.Scanner;

public class BaekJoon13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] arr1 = new long[num - 1];
        long[] arr2 = new long[num];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        long price = arr1[0] * arr2[0]; // 초기 연료비
        int now = 0;
        int next = now + 1;
        while (next < num - 1) {
            if (arr2[now] < arr2[next]) {
                price += arr2[now] * arr1[next];
            } else {
                price += arr2[next] * arr1[next];
                now = next;
            }

            next++;
        }
        System.out.println(price);
    }
}
