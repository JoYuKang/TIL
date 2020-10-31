package tomorrow;

public class JumpAndTeleport {
	public static void main(String[] args) {
		int n = 5;
		int n1 = 6;
		int n2 = 5000;
		System.out.println(solution(n));
		System.out.println(solution(n1));
		System.out.println(solution(n2));

	}

	static public int solution(int n) {
		int ans = 0;
		while (true) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n--;
				ans++;
			}

			if (n == 0) {
				break;
			}
		}

		return ans;
	}
}
