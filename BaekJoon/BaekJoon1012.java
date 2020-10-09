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
			int[] dx = { 1, -1, 0, 0 }; // ��, ��, ��, ��
			int[] dy = { 0, 0, 1, -1 };

			Dot d = q.poll();
			for (int i = 0; i < 4; i++) {
				// ���� �湮�� ��ǥ nextX, nextY
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];

				// �迭 ���� �ȿ����� ����
				if (nextX >= 0 && nextY >= 0 && nextX < h && nextY < w) {
					// �迭�� 1�� �������鼭 ���� �湮 ���� ���¸�
					if (!visit[nextX][nextY] && arr[nextX][nextY] == 1) {
						// �湮 ��ǥ�� �� �ֱ�
						q.add(new Dot(nextX, nextY));
						// ���� ��ǥ�� �湮�������� ǥ��
						visit[nextX][nextY] = true;
					}
				}
			}

		}

	}

}
