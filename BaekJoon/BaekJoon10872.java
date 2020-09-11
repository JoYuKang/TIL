package tomorrow;

import java.util.Scanner;

public class BaekJoon10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 1;

		for (int i = 1; i <= a; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
