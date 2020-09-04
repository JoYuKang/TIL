package java_test01;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		HashSet<Integer> c = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt() % 42;

		}
		
		for (int i = 0; i < a.length; i++) {
			c.add(a[i]);
		}
		System.out.println(c.size());
	}
}
