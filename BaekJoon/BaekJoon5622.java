package test02;

import java.util.Scanner;

public class BaekJoon5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') {
				sum = sum + 3;
			} else if (str.charAt(i) == 'd' || str.charAt(i) == 'e' || str.charAt(i) == 'f') {
				sum = sum + 4;
			} else if (str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'i') {
				sum = sum + 5;
			} else if (str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l') {
				sum = sum + 6;
			} else if (str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'o') {
				sum = sum + 7;
			} else if (str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 's') {
				sum = sum + 8;
			} else if (str.charAt(i) == 't' || str.charAt(i) == 'u' || str.charAt(i) == 'v') {
				sum = sum + 9;
			} else if (str.charAt(i) == 'x' || str.charAt(i) == 'w' || str.charAt(i) == 'y' || str.charAt(i) == 'z') {
				sum = sum + 10;
			} else if (str.charAt(i) == 0) {
				sum = sum + 11;
			} else if (str.charAt(i) == 1) {
				sum = sum + 2;
			}

		}
		System.out.println(sum);
	}
}
