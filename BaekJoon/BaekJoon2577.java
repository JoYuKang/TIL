package java_test01;

import java.util.Scanner;

public class BaekJoon2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int[] num = new int[10];

		String x = String.valueOf(a * b * c);
        for (int i = 0; i < x.length(); ++i) {
        	num[x.charAt(i) - '0']++;
        }
         
        for (int i = 0; i < num.length; ++i) {
            System.out.println(num[i]);
        }
			

	}
}
