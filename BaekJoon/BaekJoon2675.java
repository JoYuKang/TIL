package test02;

import java.util.Scanner;

public class BaekJoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < n; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
//}for(int i = 0; i < N ; i++) {
//	int n = sc.nextInt();
//	String str = sc.next();
//	for(int j = 0; j < str.length() ; j++) {
//		for(int k = 0; k < n; k++)
//			System.out.print(str.charAt(j));
//	}
//	System.out.println();