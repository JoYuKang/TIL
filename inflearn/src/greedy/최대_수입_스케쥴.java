package greedy;

import java.util.*;

public class 최대_수입_스케쥴 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Schedule> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int money = sc.nextInt();
            int date = sc.nextInt();
            list.add(new Schedule(money, date));
        }
        Collections.sort(list, new Comparator<Schedule>() {
            @Override
            public int compare(Schedule o1, Schedule o2) {
                return o2.date - o1.date;
            }
        });

        int checkDate = list.get(0).date;
        boolean checkLast = true;
        for (Schedule schedule : list) {
            checkLast = false;
            if (schedule.date == checkDate) {
                checkLast = true;
            }else if(schedule.date != checkDate){
                checkDate = schedule.date;
            }
            if (!q.isEmpty() && !checkLast){
                sum += q.poll();
            }
            q.add(schedule.money);
        }
        if (checkLast) {
            sum += q.poll();
        }

        System.out.println(sum);


    }
    public static class Schedule{
        int money;
        int date;

        Schedule(int money, int date) {
            this.money = money;
            this.date = date;
        }

    }
}
