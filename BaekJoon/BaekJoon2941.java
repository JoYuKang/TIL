package test02;

import java.util.Scanner;

public class BaekJoon2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String cro[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int sum = 0;
		for (int i = 0; i < cro.length; i++) {
			while (str.contains(cro[i])) {
				str = str.replaceFirst(cro[i], " ");
				sum++;
			}
		}
		str = str.replace(" ", "");
		sum += str.length();
		System.out.println(sum);
	}
}

// 런타임 에러		
//		int sum = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'c') {
//				if (str.charAt(i + 1) == '-' || str.charAt(i + 1) == '=') {
//					i++;
//				}
//			} else if (str.charAt(i) == 'd') {
//				if (str.charAt(i + 1) == 'z') {
//					if (str.charAt(i + 2) == '=') {
//						i = i + 2;
//					}
//				} else if (str.charAt(i + 1) == '-') {
//					i++;
//				}
//			} else if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') {
//				i++;
//			} else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') {
//				i++;
//			} else if (str.charAt(i) == 's' && str.charAt(i + 1) == '=') {
//				i++;
//			} else if (str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
//				i++;
//			}
//			sum++;
//		}
//		System.out.println(sum);
