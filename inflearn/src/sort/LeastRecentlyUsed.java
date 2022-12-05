package sort;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeastRecentlyUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int len = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            int num = sc.nextInt();
            if (!queue.contains(num)) {
                if (queue.size() == size) {
                    queue.poll();
                }
                queue.add(num);
            }else {
                queue.remove(num);
                queue.add(num);
            }
        }
        int[] answer = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = queue.poll();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
