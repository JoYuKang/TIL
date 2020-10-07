package tomorrow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon2178 {
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

		h = sc.nextInt();
		w = sc.nextInt();
		sc.nextLine();

		arr = new int[101][101];
		visit = new boolean[101][101];
		for (int i = 0; i < h; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < w; j++) {
				arr[i][j] = str.charAt(j) - 48;
				visit[i][j] = false;
			}
		}
		visit[0][0] = true;
		bfs(0, 0);
		System.out.println(arr[h - 1][w - 1]);

	}

	static void bfs(int n, int m) {
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(n, m));
		visit[n][m] = true;
		int[] dx = { 1, -1, 0, 0 }; // ��, ��, ��, ��
		int[] dy = { 0, 0, 1, -1 };
		while (!q.isEmpty()) {
			Dot d = q.poll();
			for (int i = 0; i < 4; i++) {
				// ���� �湮�� ��ǥ nextX, nextY
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				//�迭 ���� �ȿ����� ���� 
				if (nextX >= 0 && nextY >= 0 && nextX < h && nextY < w) {
					//�迭�� 1�� �������鼭 ���� �湮 ���� ���¸�
					if (!visit[nextX][nextY] && arr[nextX][nextY] == 1) {
						// �湮 ��ǥ�� �� �ֱ�
						q.add(new Dot(nextX, nextY));
						// �迭�ȿ� ���� �湮�� ���� ���� �湮�ߴ� ������ 1ĭ �� �����ϹǷ� +1 ???
						arr[nextX][nextY] = arr[d.x][d.y] + 1;

						// ���� ��ǥ�� �湮�������� ǥ��
						visit[nextX][nextY] = true;
					}
				}

			}
		}

	}
}
