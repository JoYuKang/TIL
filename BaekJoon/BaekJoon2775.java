package tomorrow;

import java.util.Scanner;

public class BaekJoon2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int f = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(el(f, k));
		}

	}

	private static int el(int a, int b) {
		if (b == 0) {
			return 0;
		} else if (a == 0) {
			return b;
		} else {
			return el(a, b - 1) + el(a - 1, b);
		}
	}
}
