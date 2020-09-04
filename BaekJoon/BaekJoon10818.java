package java_test01;

import java.util.Scanner;

public class BaekJoon10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a[] = new int[T];

		for (int i = 0; i < T; i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
