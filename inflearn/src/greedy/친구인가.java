package greedy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 친구인가 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int num = sc.nextInt();
        int[] visit = new int[people + 1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= people; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < num; i++) {
            int friend1 = sc.nextInt();
            int friend2 = sc.nextInt();
            list.get(friend1).add(friend2);
            list.get(friend2).add(friend1);
        }

        Queue<Integer> temp = new LinkedList<>();
        int checkNum1 = sc.nextInt();
        int checkNum2 = sc.nextInt();
        temp.add(checkNum1);
        boolean answer = false;
        while (!temp.isEmpty()) {
            for (int i : list.get(temp.poll())) {
                if (visit[i] == 0) {
                    temp.add(i);
                    visit[i] = 1;
                    if (i == checkNum2) {
                        System.out.println("YES");
                        answer = true;
                        break;
                    }
                }
            }

        }
        if (!answer) System.out.println("NO");

    }
}
