package java_test01;

import java.util.Scanner;

public class BaekJoon5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 0, 0, 0, 0, 0 };
		a[0] = sc.nextInt();

		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		a[4] = sc.nextInt();
		int min1 = a[0];
		int min2 = a[3];
		for (int i = 0; i < 3; i++) {
			if (min1 > a[i] && (a[i] <= 2000 && a[i] >= 100)) {
				min1 = a[i];
			}
		}
		for (int j = 3; j < a.length; j++) {
			if (min2 > a[j] && (a[j] <= 2000 && a[j] >= 100)) {
				min2 = a[j];
			}
		}
		System.out.println(min1 + min2 - 50);

	}
}
