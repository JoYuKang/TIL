package tomorrow;

import java.util.StringTokenizer;

public class MinAndMax {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		
		System.out.println(solution(s));
	}

	public static String solution(String s) {

		StringTokenizer st = new StringTokenizer(s, " ");
		int[] arr = new int[st.countTokens()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		String answer = min + " " + max;
		//System.out.println(answer);
		return answer;
	}
}
