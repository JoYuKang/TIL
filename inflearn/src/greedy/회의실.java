package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int beforeEnd = 0;
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (beforeEnd <= arr[i][0]) {
                cnt++;
                beforeEnd = arr[i][1];
            }
        }


//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(cnt);
    }
}
