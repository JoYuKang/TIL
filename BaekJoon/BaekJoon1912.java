package tomorrow;

import java.util.Scanner;

public class BaekJoon1912 {
	public static void main(String[] args) {
		//continuous sum
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
			if (sum < 0)
				sum = 0;
		}

		System.out.print(max);
	}

}
