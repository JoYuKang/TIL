package java_test01;

import java.util.Scanner;

public class BaekJoon8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		String[] s = new String[a];

		for (int i = 0; i < a; i++) {
			int count = 0;
			int sum = 0;
			s[i] = sc.next();
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'O') {
					sum = sum + ++count;
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
		}

	}
}