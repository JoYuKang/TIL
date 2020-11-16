package tomorrow;

import java.util.Arrays;

public class Binary_transformation {
	public static void main(String[] args) {
		String s = "110010101001";
		System.out.println(Arrays.toString(solution(s)));
	}

	public static int[] solution(String s) {
		int[] answer = {0,0};
		int count = 0;
		int zero = 0;
		int one = 0;
		while (true) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					one++;
				}
				if (s.charAt(i) == '0') {
					zero++;
				}
			}
			count++;
			if(one==1) {
				break;
			}

			s = Integer.toBinaryString(one);
			one = 0;
			System.out.println(s);
			
			
		}
		answer[0] = count;
		answer[1] = zero;

		return answer;
	}

}
