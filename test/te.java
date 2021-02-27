package todaytest;

import java.util.Scanner;

public class te {
    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = 0;
        int max = 0;
        int str = 0;
        if (arr.length / 2 == 1) {
            mid = arr.length / 2 - 1;
        } else {
            mid = arr.length / 2;
        }
        while (true) {
            int n = 0;
            int m = 0;

            for (int i = str; i < mid; i++) {
                if (n < arr[i]) {
                    n = arr[i];
                }
            }
            for (int i = mid; i < arr.length; i++) {
                if (m < arr[i]) {
                    m = arr[i];
                }
            }
            if (n > m) {
                max += n;
                str = mid;
            } else {
                max += m;
                mid--;
            }
            if (mid ==str+1) {
                break;
            }
        }
        System.out.println(max);
    }
}
