package pro;

import java.util.*;

public class 귤고르기 {

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : tangerine) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(hashMap.values());
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer integer : list) {
            if (k <= 0) {
                break;
            }
            answer++;
            k -=integer;

        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }
}
