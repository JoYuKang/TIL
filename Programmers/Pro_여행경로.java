package todaytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pro_여행경로 {
    static boolean[] visited;  //방문 확인
    static ArrayList<String> answers;

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println((Arrays.toString(solution(tickets))));
    }

    static public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        answers = new ArrayList<String>();
        int count = 0;                                    //몇개의 공항을 들렸는지 알려주는 카운트
        dfs(count, "ICN", "ICN", tickets);
        //dfs(count, tickets[0][0], tickets[0][0], tickets);
        Collections.sort(answers);                        //답들 중 가장 알파벳순이 빠른 배열들로 정렬
        return answers.get(0).split(" ");
    }

    static public void dfs(int count, String present, String answer, String[][] ticktes) {
        if (count == ticktes.length) {            //모든 공항을 들렸다면
            answers.add(answer);                //answers에 추가
        }
        for (int i = 0; i < ticktes.length; i++) {
            if (!visited[i] && ticktes[i][0].equals(present)) {        //present와 같고 들리지 않은 공항을 찾고
                visited[i] = true;                                    //해당 공항을 들린걸로 만듬.
                dfs(count + 1, ticktes[i][1], answer + " " + ticktes[i][1], ticktes);    //카운트 +1 도착 공항을 present로 넣어주고 answer에 도착공항을 추가해준다.
                visited[i] = false;
            }
        }
    }
}
