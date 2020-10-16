package tomorrow;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1744_final {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int down = 0;
		int up = 0;
		int zero = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
			if (arr[i] > 0) {
				up++;
			} else if (arr[i] < 0) {
				down++;
			} else {
				zero++;
			}
		}
		Arrays.sort(arr);

		for (int i = 0; i < down; i++) {
			if (arr[i] < 0 && arr[i + 1] < 0) {
				sum += arr[i] * arr[i + 1];
				i++;
			} else {
				sum += arr[i];
			}
		}

		if (up % 2 == 1) {
			sum += arr[down];
			down++;
		}

		for (int i = down + zero; i < up; i += 2) {
			if (arr[i] + arr[i + 1] > arr[i] * arr[i + 1]) {
				sum += arr[i] + arr[i + 1];
			} else {
				sum += arr[i] * arr[i + 1];
			}

		}

		System.out.println(sum);
	}
}
