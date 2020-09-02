package java_test01;

import java.util.Scanner;

public class BaekJoon10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] y = new int[N];
		// for (int i = 0; i < N; i++) {
		// y[i] = (int) (Math.random() * N + 1);
		// for (int x = 0; x < i; x++) {
		// if (y[x] == y[i]) {
		// i--;
		// }
		// }
		// }

		for (int i = 0; i < N; i++) {
			y[i] = sc.nextInt();
		}

		for (int x = 0; x < N; x++) {
			if (y[x] < X) {
				System.out.print(y[x] + " ");
			}
		}
	}
}
