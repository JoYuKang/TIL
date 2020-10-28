package tomorrow;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 5, 4 };
		int[] arr1 = {2,2,3,3};
		
		int num = 9;
		int num1 =10;
		System.out.println(solution(arr, num));
		System.out.println(solution(arr1, num1));
	}

	static public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		int sum = 0;

		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			if (budget >= sum) {
				answer++;
			}
		}

		return answer;
	}
}
