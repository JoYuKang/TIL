package tomorrow;

import java.util.Scanner;

public class BaekJoon2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			s[i] = a;
		}
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (s[i] + s[j] + s[k] <= m && s[i] + s[j] + s[k] > sum) {
						sum = s[i] + s[j] + s[k];
					}
				}
			}
		}
		System.out.println(sum);
	}
}
