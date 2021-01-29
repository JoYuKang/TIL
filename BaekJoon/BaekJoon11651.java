package todaytest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        int[][] arr2 = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])
                    return Integer.compare(o1[0], o2[0]);
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
