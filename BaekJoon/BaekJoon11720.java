package test02;

import java.util.Scanner;

public class BaekJoon11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		String l = sc.next();

		for (int i = 0; i < a; i++) {
			sum += l.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
