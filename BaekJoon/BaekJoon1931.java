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
		 * Comparator �������̽��� ����ü�� Arrays.sort()�� Collections.sort()�� ���� ���� �޼����� �߰� ���ڷ�
		 * �ѱ�� ���� ������ ������ Ŭ������ ��ü�� ���� ���� ������ �����ϰ� ���ο� ���� �������� ��ü�� ������ �� �ִ�.
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
