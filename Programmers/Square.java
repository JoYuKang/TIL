package tomorrow;

public class Square {
	//멀쩡한 사각형
	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.println(solution(w, h));
	}

	public static long solution(int w, int h) {
		long answer = 0;
		long min = (long) h;
		long max = (long) w;
		

		long value = 1;
		// 최대 공배수 구하는 방법
		while (value != 0) {
			value = max % min;
			max = min;
			min = value;
		}

		answer = (long) w * (long) h - ((long) w + (long) h - max);
		return answer;
	}

}