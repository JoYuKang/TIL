package java_test01;


import java.util.Scanner;

public class BaekJoon4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int[] z = new int[a];
			int sum = 0;
			double count = 0;
			double avg = 0;
			for (int j = 0; j < a; j++) {
				z[j] = sc.nextInt();
				sum += z[j];
			}
			avg = (double) sum / a;
			//System.out.println(sum + "   " + avg);
			for (int x = 0; x < a; x++) {
				if (avg < z[x]) {
					count++;
				}
			}
			//System.out.println(count + " " + a);
			System.out.printf("%.3f", 100.0 * count / a);
			System.out.println("%");
		}

	}
}
