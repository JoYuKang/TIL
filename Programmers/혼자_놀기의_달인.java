package pro;

import java.util.ArrayList;
import java.util.Collections;

public class 혼자_놀기의_달인 {
    public static int solution(int[] cards) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int[] visited = new int[cards.length];
        for (int i = 0; i < cards.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            int cnt = i;
            int num = 0;
            while (visited[cnt] == 0) {
                visited[cnt] = 1;
                cnt = cards[cnt] - 1;
                num++;
            }
            list.add(num);
        }

        Collections.sort(list, Collections.reverseOrder());
        if (list.size() < 2) {
            return 0;
        }
        answer = list.get(0) * list.get(1);

        return answer;
    }
    public static void main(String[] args) {
        int[] cards = {8, 6, 3, 7, 2, 5, 1, 4};
        System.out.println(solution(cards));
    }
}
