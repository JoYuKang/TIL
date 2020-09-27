package tomorrow;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11399 {
	public static void main(String[] args) { // ATM
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int s = 0;
			for (int j = 0; j < i; j++) {
				s += arr[j];
			}
			sum += +arr[i] + s;
		}

		System.out.println(sum);

	}
}
