package tomorrow;

import java.util.Scanner;

public class BaekJoon2606 {
	static int arr[][];
	static boolean visit[];
	static int n;
	static int count = 0;

	public static void main(String[] agrs) {
		// 바이러스 DFS 깊이 우선 탐색
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();

		arr = new int[n + 1][n + 1];
		visit = new boolean[n + 1];

		int num1 = 0;
		int num2 = 0;

		for (int i = 1; i <= m; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			arr[num1][num2] = arr[num2][num1] = 1;
		}

		dfs(1);

		System.out.println(count);
	}

	public static void dfs(int d) {
		visit[d] = true;

		for (int i = 1; i < n + 1; i++) {
			if (arr[d][i] == 1 && !visit[i]) {
				count++;
				dfs(i);
			}
		}
	}
}