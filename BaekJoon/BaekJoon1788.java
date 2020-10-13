package tomorrow;

import java.util.Scanner;

public class BaekJoon1788 {
	static int arr[] = new int[1000001];

	static int fivo(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else if (arr[num] != 0) {
			return arr[num];
		}
		return arr[num] = (fivo(num - 1) + fivo(num - 2)) % 1000000000;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println(-1);
			System.out.println(fivo(Math.abs(num)));
			
		} else if (num == 0) {
			System.out.println(0);
			if (fivo(Math.abs(num)) == 0) {
				System.out.println(0);
			}
		} else if ( num > 0) {
			System.out.println(1);
			if (fivo(Math.abs(num)) >= 1) {
				System.out.println(fivo(Math.abs(num)));
			}
		}

	}
}
