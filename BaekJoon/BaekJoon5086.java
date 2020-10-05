package tomorrow;

import java.util.Scanner;

public class BaekJoon5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			int sa = sc.nextInt();
			if (num == 0 && sa == 0)
				break;
			if (sa % num == 0) {
				System.out.println("factor");
			} else if (num % sa == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}

		}

	}
}
