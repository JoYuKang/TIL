package todaytest;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(arr);
        str.delete(0, str.length());
        for (int j : arr) {
            str.append(j);
        }
        str.reverse();

        System.out.println(str);
    }
}
