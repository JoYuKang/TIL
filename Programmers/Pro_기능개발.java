package todaytest;

import java.util.*;

public class Pro_기능개발 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    static public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> result = new LinkedList<>();    // 배포 수 저장
        int index = 0, count = 0;        // index: 배포할 수 있는 기준, count: 한 번에 배포되는 수

        while (index < progresses.length) {    //
            for (int i = 0; i < progresses.length; i++)    // 하루 진도율 처리
                progresses[i] += speeds[i];

            if (progresses[index] >= 100) {    // index 작업이 배포될 수 있으면
                while (index < progresses.length && progresses[index] >= 100) {    // 다른 것도 같이 배포될 수 있는지
                    count++;
                    index++;
                }

                result.offer(count);        // 한 번에 배포된 개수 저장
                count = 0;
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = result.poll();

        return answer;


    }
}
