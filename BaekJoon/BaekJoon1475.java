package todaytest;

import java.util.Scanner;

public class BaekJoon1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') {
                arr[1]++;
            } else if (num.charAt(i) == '2') {
                arr[2]++;
            } else if (num.charAt(i) == '3') {
                arr[3]++;
            } else if (num.charAt(i) == '4') {
                arr[4]++;
            } else if (num.charAt(i) == '5') {
                arr[5]++;
            } else if (num.charAt(i) == '6') {
                arr[9]++;
            } else if (num.charAt(i) == '7') {
                arr[7]++;
            } else if (num.charAt(i) == '8') {
                arr[8]++;
            } else if (num.charAt(i) == '9') {
                arr[9]++;
            } else if (num.charAt(i) == '0') {
                arr[0]++;
            }
        }
        if (arr[9] >= 2) {
            arr[9] = arr[9] / 2 + arr[9] % 2;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sum) {
                sum = arr[i];
            }
        }
        System.out.println(sum);
    }
}
