package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {
    static class Person{
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            queue.add(new Person(i, sc.nextInt()));
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            for (Person x : queue) {
                if (x.priority > person.priority) {
                    queue.add(person);
                    person = null;
                    break;
                }
            }
            if (person != null) {
                count++;
                if (person.id == target) {
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
