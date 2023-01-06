package pro;

import java.util.HashSet;
import java.util.Set;

public class 연속_부분_수열_합의_개수 {
    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= elements.length; i++) {
            int sum = 0;
            for (int j = 0; j < elements.length; j++) {
                if (j == 0) {
                    for (int k = 0; k < i; k++) {
                        sum += elements[k];
                    }
                }else {
                    sum -= elements[j - 1];
                    sum += elements[(j + i - 1) % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 9, 1, 1, 4}));
    }
}
