package tomorrow;

import java.util.Scanner;

public class BaekJoon4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt(); // �� �Է�
			int b = sc.nextInt(); // �� �Է�
			int c = sc.nextInt(); // �� �Է�

			if (((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b))
					&& (a != 0 && b != 0 && c != 0)) { // �����ﰢ���϶� ���
				System.out.println("right");
			} else if (a == 0 && b == 0 && c == 0) { // a, b, c ���� 0�϶� ����

				break;
			} else { // �����ﰢ���� �ƴҶ� ���
				System.out.println("wrong");
			}

		}
	}
}
