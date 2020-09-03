package java_test01;

import java.util.Scanner;

public class BaekJoon10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {0,0,0,0,0};
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			if (a[i] < 40) {
				a[i] = 40;
			}
			sum += a[i];
		}
		int avg = sum / a.length;
		System.out.println(avg);
	}
}
