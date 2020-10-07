package tomorrow;

import java.util.Scanner;

public class BaekJoon11726 {
	static int arr[] = new int[1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(dp(num));
		
	}

	static int dp(int x) {
		if (x == 1) {
			return 1;
		} else if (x == 2) {
			return 2;
		} else if (arr[x] != 0) {
			return arr[x];
		}

		return arr[x] = (dp(x - 1) + dp(x - 2)) % 10007;

	}
}
