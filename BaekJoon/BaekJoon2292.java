package tomorrow;

import java.util.Scanner;

public class BaekJoon2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 1;
		int count = 0;
		// 6 12 18 24
		if (a == 1) {
			count++;
		}
		while (a > n) {
			n = n + 6 * count;
			count++;

		}
		System.out.println(count);
	}
}
