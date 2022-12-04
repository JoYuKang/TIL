package queue;

import java.util.*;

public class 공주_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }
        int count = 0;
        while (queue.size() != 1) {
            count++;
            if (count % target == 0) {
                queue.poll();
            } else {
                queue.add(queue.poll());
            }
        }
        System.out.println(queue.poll());
    }
}
