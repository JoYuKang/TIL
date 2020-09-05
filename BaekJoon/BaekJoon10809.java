package test02;

import java.util.Scanner;

public class BaekJoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		for (char b = 'a'; b < 'z'; b++) {
			System.out.print(a.indexOf(b)+" ");
		}

	}
}
