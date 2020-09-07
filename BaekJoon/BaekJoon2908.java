package test02;

import java.util.Scanner;

public class BaekJoon2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
		while (a != 0) {
			c = c * 10 + a % 10;
			a = a / 10;
		}
		while (b != 0) {
			d = d * 10 + b % 10;
			b = b / 10;
		}
		if(c>d) {
			System.out.println(c);
		}
		else {
			System.out.println(d);
		}

	}
}
