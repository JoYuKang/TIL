package tomorrow;

import java.util.Scanner;

public class BaekJoon1929 {
	public static void main(String[] args) {
		// 소수 구하기
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			a[i] = 0;
		}
		a[1] = 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 2; i * j <= n; j++) {
				a[i * j] = 1;
			}
		}
		for (int i = m; i <= n; i++) {
			if (a[i] != 1)
				System.out.println(i);
		}
	}
}
//시간초과
//while (b - a != 0) {
//	int count = 0;
//	for (double j = 2; j * j <= a; j++) {
//		if (a % j == 0) {
//			count++;
//		}
//	}
//	if (count == 0 && a != 1) {
//		System.out.print(a + "\n");
//	}
//	a++;
//}
//}
//}