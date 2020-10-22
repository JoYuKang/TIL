package tomorrow;

import java.util.Scanner;

public class BaekJoon1300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int k = sc.nextInt();

		int left = 1;
		int right = k;
		int count = 0;

		while (left <= right) { // 1 < k
			int mid = (left + right) / 2; // 4
			int cnt = getCnt(mid, num); // 4 3
			if (cnt >= k) {
				count = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(count);
	}

	static int getCnt(int x, int n) { // 4 3
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count += Math.min(x / i, n);
		}
		return count;
	}
}
