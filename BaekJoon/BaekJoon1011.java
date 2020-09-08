package tomorrow;

import java.util.Scanner;

public class BaekJoon1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			int str = sc.nextInt();
			int end = sc.nextInt();
			int dis = end - str; 

			int max = (int) Math.sqrt(dis); 

			if (max == Math.sqrt(dis)) {
				System.out.println(max * 2 - 1);
			} else if (dis <= max * max + max) {
				System.out.println(max * 2);
			} else {
				System.out.println(max * 2 + 1);
			}

		}
	}
}
