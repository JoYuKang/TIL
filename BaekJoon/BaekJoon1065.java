package test02;

import java.util.Scanner;

public class BaekJoon1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i < 10) {
				count++;
			} else if (i >= 10 && i < 100) {
				count++;
			} else if (i >= 100) {
				if (i / 100 - (i / 10) % 10 == i / 10 % 10 - i % 10) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
