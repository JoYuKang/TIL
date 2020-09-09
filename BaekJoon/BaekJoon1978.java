package tomorrow;

import java.util.Scanner;

public class BaekJoon1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result = 0;

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int count = 0;
			for (int j = 1; j <= a; j++) {
				if (a % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				result++;
			}
		}
		System.out.println(result);

	}
}
