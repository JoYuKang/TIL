package tomorrow;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[][] = new int[num][2];
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[i][0] = a;
			arr[i][1] = b;

		}
		/*
		 * Comparator 인터페이스의 구현체를 Arrays.sort()나 Collections.sort()와 같은 정렬 메서드의 추가 인자로
		 * 넘기면 정렬 기준을 누락된 클래스의 객체나 기존 정렬 기준을 무시하고 새로운 정렬 기준으로 객체를 정렬할 수 있다.
		 */

		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] start, int[] end) {
				// TODO Auto-generated method stub
				if (start[1] == end[1]) {
					return Integer.compare(start[0], end[0]);
				}
				return Integer.compare(start[1], end[1]);
			}

		});
		int count = 0;
		int end = -1;
		for (int i = 0; i < num; i++) {
			if (arr[i][0] >= end) {
				end = arr[i][1];
				count++;
			}
		}

		System.out.println(count);
	}
}
