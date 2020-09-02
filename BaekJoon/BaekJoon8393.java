package java_test01;

import java.util.Scanner;

public class BaekJoon8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int a = 0; a<=n;a++) {
			sum += a;
		}
		System.out.println(sum);
	}
}
