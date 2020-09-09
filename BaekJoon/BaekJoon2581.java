package tomorrow;

import java.util.Scanner;

public class BaekJoon2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		int min = end;
		for (int i = str; i <= end; i++) {
			int count = 0;
			for (int j = 1; j <= str; j++) {
				if (str % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum += str;
				if (min > str) {
					min = str;
				}
			}
			str++;
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
}
