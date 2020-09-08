package tomorrow;

import java.util.Scanner;

public class BaekJoon2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 2
		int b = sc.nextInt(); // 1
		int c = sc.nextInt(); // 5
		int d = (c - b) / (a - b);
		if ((c - b) % (a - b) != 0) {
			d++;
		}
		System.out.println(d);
	}
}
