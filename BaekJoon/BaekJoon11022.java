package java_test01;

import java.util.Scanner;

public class BaekJoon11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int a = 1; a <= T; a++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A + B;
			System.out.println("Case #" + a + ": " + A + " + " + B + " = " + C);
		}
	}
}
