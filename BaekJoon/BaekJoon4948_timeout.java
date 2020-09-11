package tomorrow;

import java.util.Scanner;

public class BaekJoon4948_timeout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int str = sc.nextInt();
			int a = str + 1;
			int end = str * 2;
			int sum = 0;
			if (str == 0) {
				break;
			}
			for (int i = a; i <= end; i++) {
				int count = 0;
				for (int j = 2; j <= a; j++) {
					if (a % j == 0) {
						count++;
						if (count > 1) {
							break;
						}
					}
				}
				if (count == 1) {
					sum++;
				}
				a++;
			}

			System.out.println(sum);

		}
	}
}