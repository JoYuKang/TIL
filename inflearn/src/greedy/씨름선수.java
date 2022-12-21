package greedy;

import java.util.*;

public class 씨름선수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] person = new int[count][2];
        int maxW = Integer.MIN_VALUE;

        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < 2; j++) {
                person[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(person, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        int cnt = 0;
        for (int i = 0; i < person.length; i++) {
            maxW = Math.max(person[i][1], maxW);
            if (maxW <= person[i][1]) {
                cnt++;
            }
        }

//        for (int i = 0; i < person.length; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(person[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(cnt);

    }
}
