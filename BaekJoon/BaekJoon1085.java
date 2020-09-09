package tomorrow;

import java.util.Scanner;

public class BaekJoon1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		if (x <= w - x && x <= y && x <= h - y) {
			System.out.println(x);
		} else if (x >= w - x && w - x <= y && w - x <= h - y) {
			System.out.println(w - x);
		} else if (y <= h - y && y <= x && y <= w - x) {
			System.out.println(y);
		} else {
			System.out.println(h - y);
		}

	}
}
