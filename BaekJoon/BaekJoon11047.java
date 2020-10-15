package tomorrow;

import java.util.Scanner;

public class BaekJoon11047 {
	public static void main(String[] args) {
		// µ¿Àü0
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = n - 1; i >= 0; i--) {
			while (k >= arr[i]) {
				k = k - arr[i];
				count++;
			}
		}

		System.out.println(count);
	}
}
