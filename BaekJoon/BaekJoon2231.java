package tomorrow;

import java.util.Scanner;

public class BaekJoon2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int min = num;

		while (true) {
			int a = 0;
			a++;
			int sum = 0;
			while (a != 0) {
				sum += a % 10;
				a = a / 10;
			}
			if (sum + a == num) {
				min = a;
				break;
			}

		}
		System.out.println(min);
	}
}
