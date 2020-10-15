package tomorrow;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1449 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 개수
		int l = sc.nextInt(); // 테이프 길이
		int count = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int tapeRange = l - 1;
		Arrays.sort(arr);

		count++;
		int str = arr[0];
		for (int i = 0; i < n; i++) {
			if (tapeRange < arr[i] - str) {
				str = arr[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
