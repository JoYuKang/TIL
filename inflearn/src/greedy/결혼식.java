package greedy;

import java.util.*;

public class 결혼식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int max = 0;
        int num = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();


        for (int i = 0; i < num; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new Time(start, 's'));
            arr.add(new Time(end, 'e'));
        }

        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.time == o2.time) {
                    return o1.check - o2.check;
                }
                return o1.time - o2.time;
            }
        });

//        for (Time time : arr) {
//            System.out.println("time = " + time.time + " " + time.check);
//        }

        for (Time time : arr) {
            if (time.check == 's') {
                max++;
                answer = Math.max(answer, max);
            }else {
                max--;
            }
        }
        System.out.println(answer);
    }
    public static class Time{
        int time;
        char check;

        Time(int time, char check) {
            this.time = time;
            this.check = check;
        }
    }
}
