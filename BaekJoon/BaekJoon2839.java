package tomorrow;

import java.util.Scanner;

public class BaekJoon2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while (true) {
			if (n % 5 == 0 && n >= 0) {
				System.out.println(n / 5 + count);
				break;
			} else if (n < 0) {
				System.out.println(-1);
				break;
			}
			n = n - 3;
			count++;

		}
	}
}
