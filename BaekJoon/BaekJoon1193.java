package tomorrow;

import java.util.Scanner;

public class BaekJoon1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int count = 0;
		while (true) {
			count++;
			sum += count;

			if (n <= sum) {
				break;
			}
		}
		int floor = n - sum + count;
		if (count % 2 == 0) {
			System.out.println(floor + "/" + (count - floor + 1));
		} else {
			if (count == 1 && count == 1) {
				System.out.println((count - floor + 1) + "/" + (floor));
			} else {
				System.out.println((count - floor + 1) + "/" + (floor ));
			}

		}
	}
}