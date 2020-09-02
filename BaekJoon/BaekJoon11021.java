package java_test01;

import java.util.Scanner;

public class BaekJoon11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int x = 1; x <= T; x++) {
			int C = 0;
			int A = sc.nextInt();
			int B = sc.nextInt();
			C = A + B;
			System.out.println("Case #" + x + ": " + C);
		}
	}
}
