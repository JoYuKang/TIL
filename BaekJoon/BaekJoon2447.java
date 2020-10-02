package tomorrow;

import java.util.Scanner;

public class BaekJoon2447 {
	static char[][] arr;

	public static void main(String[] args) {
		// �����-10
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//3
		arr = new char[num][num]; //3 3

		star(0, 0, num, false); //0 0 3 false

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);

	}

	static void star(int x, int y, int N, boolean blank) {
					// 0 0 3 false 
 	 	// ����ĭ�� ���
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		// ���̻� �ɰ� �� ���� ����� ��
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		/*
		 * N=27 �� ��� �� ����� ������� 9�̰�,
		 * N=9 �� ��� �� ����� ������� 3�̵� �ش� ����� �� ĭ�� ���� ������ �ǹ� size
		 * count�� �� ��� ������ �ǹ�
		 */

		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // ���� ĭ�� ���
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}
}
