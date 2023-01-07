package pro;

import java.util.HashMap;

public class 할인_행사 {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            hashMap.put(want[i], number[i]);
        }
        for (int i = 0; i < discount.length - 9; i++) {
            boolean check = true;
            if (i == 0) {
                for (int j = 0; j < 10; j++) {
                    hashMap.put(discount[j], hashMap.getOrDefault(discount[j], 0) - 1);
                }
            }
            else {
                hashMap.put(discount[i - 1], hashMap.get(discount[i - 1]) + 1);
                hashMap.put(discount[i + 9], hashMap.getOrDefault(discount[i + 9], 0) - 1);
            }
            for (int j = 0; j < want.length; j++) {
                if (hashMap.get(want[j]) > 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer++;
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }
}
