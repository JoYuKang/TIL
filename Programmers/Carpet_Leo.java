package pro;

import java.util.Arrays;

public class Carpet_Leo {
	public static void main(String[] args) {
		int brown = 16;
		int yellow = 9;
		System.out.println(Arrays.toString(solution(brown, yellow)));
	}

	static public int[] solution(int brown, int yellow) {
		int[] answer = { 0, 0 };

		// 식 구하기									H = 5, W=5 ,brown = 16, yellow = 9
		// 테두리 (w -2) * 2 + (h - 2) * 2 +4 = brown ->  6 + 6 +4 = 16   
		// w + h = (brown + 4) / 2  -> 10 = 16 +4 /2 
		// w = (brown+4)/2 - h		-> 5 = 	10 - 5
		// w * h = brown + yellow   -> 25 = 16 + 9 
		// w = ((brown + 4) / 2 + sqrt(((brown + 4) / 2)^2 - 4 * brown + yellow)) / 2
		
		// h = ((brown + 4) / 2 - sqrt(((brown + 4) / 2)^2 - 4 * brown + yellow)) / 2
		
		int term = (int) Math.sqrt((brown + 4) * (brown + 4) / 4 - 4 * (brown + yellow)); // 제곱근 구하기
									// (16 + 4) * (16 + 4) / 4 - 4 * 100
									// 20 * 20 / 4 - 400
									// - 300
		System.out.println(term);
		int w = ((brown + 4) / 2 + term) / 2;

		int h = ((brown + 4) / 2 - term) / 2;
		answer[0] = w;
		answer[1] = h;
		
		return answer;
	}
}
