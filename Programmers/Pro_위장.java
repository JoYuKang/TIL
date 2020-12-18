package todaytest;

import java.util.HashMap;

public class Pro_위장 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    static public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            if(map.get(clothes[i][1]) == null)
                map.put(clothes[i][1], 1);
            else
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }

        for(String keys: map.keySet()) {
            answer *= (map.get(keys) + 1);
        }

        answer -= 1;

        return answer;
    }
}
