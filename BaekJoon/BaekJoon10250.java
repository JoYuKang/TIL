package tomorrow;

import java.util.Scanner;

public class BaekJoon10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int f = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int count = 0;
			String room = null;
			for (int j = 1; j <= w; j++) {
				for (int k = 1; k <= f; k++) {
					count++;
					if (count == n) {
						if(j<10) {
						room = k+"0"+j;
						break;}
						else {
							room = k+""+j;
						}
					}
				}
			}

			System.out.println(room);
		}

	}
}
