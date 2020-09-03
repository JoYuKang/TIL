package java_test01;

import java.util.Scanner;

public class BaekJoon2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = "*";
		for (int j = 1; j <= n; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print(a);
			}
			System.out.println();				
		}
		for (int j = n; j > 1; j--) {
			for (int i = 1; i < j; i++) {
				System.out.print(a);
			}
			System.out.println();				
		}
	}
}
