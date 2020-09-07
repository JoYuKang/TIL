package test02;

import java.util.Scanner;

public class BaekJoon1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String str = sc.next().toLowerCase(); ��Ÿ�� ����
		String str = sc.next().toUpperCase();
		int[] count = new int[26];

		int max = 0;
		char result = '?';

		for (int i = 0; i < str.length(); i++) {

			count[str.charAt(i) - 65]++;
			// max < count[str.charAt(i) - 'a' �޸� �ʰ�
			if (max < count[str.charAt(i) - 65]) {
				max = count[str.charAt(i) - 65];
				result = str.charAt(i);
			} else if (max == count[str.charAt(i) - 65]) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
