package tomorrow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1012 {
            
	static int arr[][];
	static boolean visit[][];

	static int h, w;

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
		StringBuffer sb = new StringBuffer();
		
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			arr = new int[51][51];
			visit = new boolean[51][51];
			h = sc.nextInt();
			w = sc.nextInt();
			int c = sc.nextInt();
			int count = 0;
			for (int j = 0; j < c; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr[a][b] = 1;
			}

			for (int k = 0; k < h; k++) {
				for (int l = 0; l < w; l++) {
					if (arr[k][l] == 1 && !visit[k][l]) {
						bfs(k, l);
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

	static void bfs(int n, int m) {

		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(n, m));
		visit[n][m] = true;
		while (!q.isEmpty()) {
			int[] dx = { 1, -1, 0, 0 }; // 우, 하, 좌, 상
			int[] dy = { 0, 0, 1, -1 };

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
						// 다음 좌표는 방문했음으로 표시
						visit[nextX][nextY] = true;
					}
				}
			}

		}

	}

}
