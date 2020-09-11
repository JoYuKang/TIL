package tomorrow;

import java.util.Scanner;

public class BaekJoon3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		int xx = 0;
		int yy = 0;
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		if (x[0] == x[1]) {
			xx = x[2];
		} else if (x[1] == x[2]) {
			xx = x[0];
		} else {
			xx = x[1];
		}
		if (y[0] == y[1]) {
			yy = y[2];
		} else if (y[1] == y[2]) {
			yy = y[0];
		} else {
			yy = y[1];
		}
		System.out.println(xx + " " + yy);

	}

}
