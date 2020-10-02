package tomorrow;

import java.util.Scanner;

public class BaekJoon2447 {
	static char[][] arr;

	public static void main(String[] args) {
		// 별찍기-10
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
 	 	// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		// 더이상 쪼갤 수 없는 블록일 때
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		/*
		 * N=27 일 경우 한 블록의 사이즈는 9이고,
		 * N=9 일 경우 한 블록의 사이즈는 3이듯 해당 블록의 한 칸을 담을 변수를 의미 size
		 * count는 별 출력 누적을 의미
		 */

		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}
}
