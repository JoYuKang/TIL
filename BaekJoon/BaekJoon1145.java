package todaytest;

import java.util.Scanner;

public class BaekJoon1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (sum > arr[i]) {
                sum = arr[i];
            }
        }

        int count = 0;
        while (true) {
            for (int j : arr) {
                if (sum % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                break;
            }
            count = 0;
            sum++;

        }
        System.out.println(sum);
    }

}
