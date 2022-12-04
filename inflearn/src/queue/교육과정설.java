package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        String curriculum = sc.next();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < target.length(); i++) {
            queue.add(target.charAt(i));
        }
        for (int i = 0; i < curriculum.length(); i++) {
            if (queue.contains(curriculum.charAt(i))){
                if (queue.poll() != curriculum.charAt(i)) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (queue.isEmpty()) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
