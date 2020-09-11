package tomorrow;

import java.util.Scanner;

public class BaekJoon11729 {
	static int count = 0;
	static StringBuilder sb = new StringBuilder();
	//하노이 탑 이동 순서
	private static void hanoi(int n, int a, int b, int c) {
							// a 시작 b 보조 c 
		count++;
		if (n == 1) {
			sb.append(a + " " + c + "\n");

		} else {
			hanoi(n - 1, a, c, b);
			sb.append(a + " " + c + "\n");
			hanoi(n - 1, b, a, c);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		hanoi(num, 1, 2, 3);
		System.out.println(count);
		System.out.println(sb);
	}

}
