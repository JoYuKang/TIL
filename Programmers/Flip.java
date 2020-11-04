package tomorrow;

public class Flip {
	// 3진법 뒤집기

	public static void main(String[] args) {
		int n = 125;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		String an = "";
		int x = 1;

		while (n != 0) {
			an = n % 3 + an;
			n = n / 3;
		}
		
		for (int i = 0; i < an.length(); i++) {
			if (an.charAt(i) != '0') {
				answer += x * (an.charAt(i) - '0');
			}

			x = x * 3;
			System.out.println(answer);
		}

		return answer;
	}

}
