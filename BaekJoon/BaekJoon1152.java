package test02;

import java.util.Scanner;

public class BaekJoon1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		int count = 1;
		if (str == null || str.equals("")) {
			System.out.println(0);
		}

		else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}

			}
			if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ') {
				count--;
			}
			System.out.println(count);
		}
	}
}
