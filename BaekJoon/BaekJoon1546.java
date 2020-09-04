package java_test01;

import java.util.Scanner;

public class BaekJoon1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] a = new int[x];
		int max = a[0];
		double sum = 0;
		for (int i = 0; i < x; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < x; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		for (int i = 0; i < x; i++) {
			sum += a[i];
		}
		System.out.println(sum / max * 100 / a.length);
	}
}
