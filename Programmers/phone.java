package Pro;

import java.util.HashSet;

public class phone {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        System.out.println(solution(nums));
    }

    static public int solution(int[] nums) {
        int answer = 0;
        HashSet hs = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            if (hs.size() < nums.length / 2) {
                hs.add(nums[i]);
            }
        }
        answer = hs.size();
        return answer;
    }
}
