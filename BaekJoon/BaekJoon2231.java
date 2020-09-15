package tomorrow;

import java.util.Scanner;

public class BaekJoon2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int a = 0;

		for (int i = 1; i < num; i++) {
			sum = i;
			int k = i;
			while (k > 0) {
				sum += k % 10;
				k = k / 10;
			}
			if (sum == num) {
				a = i;
				//	System.out.println(a);
				break;
			}

		}
		System.out.println(a);
	}
}
