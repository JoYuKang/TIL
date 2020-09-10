package tomorrow;

import java.util.Scanner;

public class BaekJoon4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt(); // 값 입력
			int b = sc.nextInt(); // 값 입력
			int c = sc.nextInt(); // 값 입력

			if (((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b))
					&& (a != 0 && b != 0 && c != 0)) { // 직각삼각형일때 출력
				System.out.println("right");
			} else if (a == 0 && b == 0 && c == 0) { // a, b, c 값이 0일때 종료

				break;
			} else { // 직각삼각형이 아닐때 출력
				System.out.println("wrong");
			}

		}
	}
}
