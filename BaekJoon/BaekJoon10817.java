package java_test01;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int mid = a[0];
		Arrays.sort(a);
		System.out.println(a[1]);
//int mid = a[0];
//		if ((a[0] > a[1] && a[0] < a[2]) || (a[0] > a[2] && a[0] < a[1])) {
//			mid = a[0];
//		}
//		else if ((a[1] > a[0] && a[1] < a[2]) || (a[1] > a[2] && a[1] < a[0])) {
//			mid = a[1];
//		}
//		else if ((a[2] > a[0] && a[2] < a[1]) || (a[2] > a[1] && a[2] < a[0])) {
//			mid = a[0];
//		}
//		else if((a[0]==a[1])&&a[0]!=a[2]) {
//			mid =a[0];
//		}
//		else if ((a[2]==a[1])&&a[2]!=a[0]) {
//			mid = a[2];
//		}
//		System.out.println(mid);
//
//	}

	}
}
