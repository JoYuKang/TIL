package java_test01;

import java.util.Scanner;

public class BaekJoon2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];

		int count = 1;
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		for (int i = 0; i < n.length; i++) {
			if (max != n[i]) {
				count++;
			} else {
				break;
			}
		}
		System.out.println(max);
		System.out.println(count);

	}
}
