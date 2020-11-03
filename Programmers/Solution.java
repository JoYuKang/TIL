package pro;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Arrays.toString(solution(a, b)));

	}

	public static int[] solution(int n, int m) {
		int[] answer = { 0, 0 };
		int temp;
		if (n > m) {
			temp = n;
			n = m;
			m = temp;
		}

		for (int i = 1; i <= m; i++) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
			}
		}
//		if (m % n != 0) {
//			answer[1] = n * m;
//		} else if (m % n == 0) {
//			answer[1] = m;
//		}
		answer[1] = n * m / answer[0];

		return answer;
	}

}
