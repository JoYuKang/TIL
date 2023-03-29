package greedy;

import java.util.*;

public class 결혼식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int max = 0;
        int num = sc.nextInt();

        // Time 객체를 넣어 시작시간과 끝나는 시간을 고려할 수 있다.
        ArrayList<Time> arr = new ArrayList<>();


        for (int i = 0; i < num; i++) {
//            int start = sc.nextInt();
//            int end = sc.nextInt();
            arr.add(new Time(sc.nextInt(), 's'));
            arr.add(new Time(sc.nextInt(), 'e'));
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

//        time 정렬 확인용 로직
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
        // 시간
        int time;
        // 시작, 끝  
        char check;

        Time(int time, char check) {
            this.time = time;
            this.check = check;
        }
    }
}
