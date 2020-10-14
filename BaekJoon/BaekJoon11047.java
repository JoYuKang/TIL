package tomorrow;

import java.util.Scanner;

public class BaekJoon11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = n - 1; i >= 0; i--) {
			if (k >= arr[i]) {
				sum += k / arr[i];
				k = k % arr[i];
			}

		}

		System.out.println(sum);
	}
}
