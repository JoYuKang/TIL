package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon1260 {
	//dfs bfs
	static ArrayList<Integer>[] arr;
	static boolean visit[];
	static int num1;
	static int num2;
	static int num3;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		num1 = Integer.parseInt(st.nextToken());
		arr = new ArrayList[num1 + 1];
		for (int i = 0; i < num1 + 1; i++) {
			arr[i] = new ArrayList<>();
		}

		visit = new boolean[num1 + 1];
		num2 = Integer.parseInt(st.nextToken());
		num3 = Integer.parseInt(st.nextToken());
		for (int i = 0; i < num2; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);

		}
		dfs(num3);
		System.out.println();
		visit = new boolean[num1 + 1];
		bfs(num3);

	}

	public static void dfs(int d) {
		if (visit[d]) {
			return;
		}

		visit[d] = true;
		System.out.print(d + " ");
		for (int y : arr[d]) {
			if (!visit[y]) {
				dfs(y);
			}
		}
//		for(int i =1;i<arr.length;i++) {
//			if (!visit[i]) {
//				dfs(i);
//			}
//		}

	}

	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visit[start] = true;

		while (!queue.isEmpty()) {
			int x = queue.poll();
			System.out.print(x + " ");
			for (int y : arr[x]) {
				if (!visit[y]) {
					visit[y] = true;
					queue.add(y);
				}
			}
		}
	}
}
