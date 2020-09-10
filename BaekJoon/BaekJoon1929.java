package tomorrow;

import java.util.Scanner;

public class BaekJoon1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n + 1];

		for (i = 0; i <= n; i++) {
			a[i] = 0;
		}
		a[1] = 1;

		for (i = 2; i <= n; i++) {
			for (j = 2; i * j <= n; j++) {
				a[i * j] = 1;
			}
		}
		for (i = m; i <= n; i++) {
			if (a[i] != 1)
				System.out.println(i);
		}
		sc.close();
	}
}

//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	double a = sc.nextInt();
//	double b = sc.nextInt();
//
//	for (double i = a; i <= b; i++) {
//		int count = 0;
//		for (double j = 2; j * j <= a; j++) {
//			if (a % j == 0) {
//				count++;
//			}
//		}
//		if (count == 0 && a != 1) {
//			System.out.println((int) a);
//		}
//		a++;
//	}
//}
//}
