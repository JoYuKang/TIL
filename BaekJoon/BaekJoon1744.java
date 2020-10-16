package tomorrow;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		int sum = 0;
		if (arr.length == 1) {
			sum = arr[0];
		}
		else if (arr.length == 2) {
			if (arr[0] > 0) {
				if (arr[0] + arr[1] > arr[0] * arr[1]) {
					sum += arr[0] + arr[1];

				} else {
					sum += arr[0] * arr[1];
				}
			} else if (arr[0] <= 0 && arr[1] <= 0) {
				sum += arr[0] * arr[1];
			} else if (arr[0] <= 0 && arr[1] > 0) {
				sum += arr[0] + arr[1];
			}
		} else {

			for (int i = n - 1; i > 0; i--) {// 4 3 2 1
				if (arr[i] > 0 && arr[i - 1] > 0) {
					if (arr[i - 1] + arr[i] > arr[i] * arr[i - 1]) {
						sum += arr[i - 1] + arr[i];
						// System.out.println(" + " + sum);
					} else if (arr[i] > 0 && i == 0) {
						sum += arr[i - 1];
					} else {
						sum += arr[i - 1] * arr[i];
						// System.out.println(" * " + sum);

					}
					i--;
					if (arr[i - 1] > 0 && i == 1) {
						sum += arr[i - 1];
					}
				} else if (arr[i] > 0 && arr[i - 1] <= 0) {
					sum += arr[i];
				} else {
					break;
				}
			}

			for (int i = 0; i < n; i++) {
				if (arr[i] < 0 && i + 1 < n) {
					if (arr[i + 1] < 0) {
						sum += arr[i] * arr[i + 1];
						// System.out.println(" *- " + arr[i]);
						i++;
					} else {
						sum += arr[i];
						// System.out.println(" - " + arr[i]);
					}
				} else if (arr[i] < 0 && i == n - 1) {
					sum += arr[i];
				} else if (arr[i] >= 0) {
					break;
				}
			}
		}
		System.out.println(sum);

	}
}
