package tomorrow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTest {
	static int arr[][] = { { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 2, 2, 2, 1 }, { 0, 0, 0, 2 } };
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

		h = arr.length;
		w = arr[0].length;
		visit = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		System.out.println(Arrays.toString(solution(arr)));
	}

	static public int[] solution(int[][] arr) {
		int[] answer = { 0, 0, 0 };

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (arr[i][j] == 0 && !visit[i][j]) {
					bfs(i, j, 0);
					answer[0]++;
				}
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 1; j < w; j++) {
				if (arr[i][j] == 1 && !visit[i][j]) {
					bfs(i, j, 1);
					answer[1]++;
				}
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 2; j < w; j++) {
				if (arr[i][j] == 2 && !visit[i][j]) {
					bfs(i, j, 2);
					answer[2]++;
				}
			}
		}

		return answer;
	}

	static void bfs(int n, int m, int k) {
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

				// �迭 ���� �ȿ����� ����
				if (nextX >= 0 && nextY >= 0 && nextX < h && nextY < w) {
					// �迭�� 1�� �������鼭 ���� �湮 ���� ���¸�
					if (!visit[nextX][nextY] && arr[nextX][nextY] == k) {
						// �湮 ��ǥ�� �� �ֱ�
						q.add(new Dot(nextX, nextY));

						// ���� ��ǥ�� �湮�������� ǥ��
						visit[nextX][nextY] = true;
					}
				}
			}

		}
	}//

}
