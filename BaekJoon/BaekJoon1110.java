package java_test01;

import java.util.Scanner;

public class BaekJoon1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 26 68 84 42
		int startnum = a;
		int count = 0;
		while (true) {
			count++;

			int b = a / 10; // 2 6 8 4 10의 자리
			int c = a % 10; // 6 8 4 2 1의자리
			int d = b + c; // 8 14 12 6 1의 자리 10의 자리 합
			int e = c * 10 + d % 10; // 68 84 42 26
			if (e == startnum) {
				break;
			}
			a = e;
		}
		System.out.println(count);
	}
}