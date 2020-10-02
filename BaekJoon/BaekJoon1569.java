package tomorrow;

import java.util.Scanner;

public class BaekJoon1569 {
	public static int[] arr;
	public static boolean[] visit;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		visit = new boolean[num];
		
		int M = sc.nextInt();
		arr = new int[M];

		dfs(num, M, 0); // 3 1 0

	}

	public static void dfs(int N, int M, int depth) { // 3 1 0
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}

}