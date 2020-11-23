package tomorrow;

import java.util.Arrays;

public class Leo {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		System.out.println(Arrays.toString(solution(brown, yellow)));
	}

	static public int[] solution(int brown, int yellow) {
		int[] answer = { 0, 0 };

		// 식 구하기
		// 테두리 (w -2) * 2 + (h - 2) * 2 +4 = brown
		// w + h = (brown + 4) / 2
		// w * h = brown + yellow
		// x*x - (brown + 4) / 2 * x + brown + yellow = 0
		// w = ((brown + 4) / 2 + sqrt(((brown + 4) / 2)^2 - 4 * brown + yellow)) / 2
		// h = ((brown + 4) / 2 - sqrt(((brown + 4) / 2)^2 - 4 * brown + yellow)) / 2
		
		int term = (int) Math.sqrt((brown + 4) * (brown + 4) / 4 - 4 * (brown + yellow)); // 제곱근 구하기
		int w = ((brown + 4) / 2 + term) / 2;

		int h = ((brown + 4) / 2 - term) / 2;
		answer[0] = w;
		answer[1] = h;
		return answer;
	}
}
