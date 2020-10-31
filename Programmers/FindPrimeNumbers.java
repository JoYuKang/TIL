package tomorrow;

import java.util.ArrayList;

public class FindPrimeNumbers {
	public static void main(String[] args) {
		int[] nums = { 2, 1, 3,4 };
		int[] nums1 = { 1, 2, 7, 6, 4 };
		System.out.println(solution(nums));
		System.out.println(solution(nums1));                  
	}

	public static int solution(int[] nums) {
		int answer = 0;

		ArrayList<Integer> hs = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					hs.add(nums[i] + nums[j] + nums[k]);
				}
			}
		}
		for (int i = 0; i < hs.size(); i++) {
			int m = hs.get(i);
			int count = 0;
			for (int j = 1; j <= m; j++) {
				if (m % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				answer++;
			}

		}

		return answer;
	}
}
