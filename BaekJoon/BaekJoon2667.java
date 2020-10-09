package tomorrow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon2667 {
	static int arr[][];
	static boolean visit[][];
	static int count = 0;
	static int h, w;
	static ArrayList<Integer> ar = new ArrayList();;

	static class Dot {
		int x;
		int y;

		public Dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = h;
		int num = 0;
		arr = new int[26][26];
		visit = new boolean[26][26];
		sc.nextLine();

		for (int i = 0; i < h; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < w; j++) {
				arr[i][j] = str.charAt(j) - 48;// '0'
				visit[i][j] = false;
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (arr[i][j] == 1 && !visit[i][j]) {
					bfs(i, j);
					num++;
				}
			}
		}
		System.out.println(num);

		Collections.sort(ar);

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

	}

	static void bfs(int n, int m) {
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(n, m));
		visit[n][m] = true;
		int[] dx = { 1, -1, 0, 0 }; // 우, 하, 좌, 상
		int[] dy = { 0, 0, 1, -1 };
		int count = 1;
		while (!q.isEmpty()) {

			Dot d = q.poll();
			for (int i = 0; i < 4; i++) {
				// 다음 방문할 좌표 nextX, nextY
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];

				// 배열 범위 안에서만 가능
				if (nextX >= 0 && nextY >= 0 && nextX < h && nextY < w) {
					// 배열에 1이 들어가있으면서 아직 방문 안한 상태만
					if (!visit[nextX][nextY] && arr[nextX][nextY] == 1) {
						// 방문 좌표에 값 넣기
						q.add(new Dot(nextX, nextY));
						count++;
						// 다음 좌표는 방문했음으로 표시
						visit[nextX][nextY] = true;
					}
				}
			}

		} //
		ar.add(count);
	}
}
