package tomorrow;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[][] agename = new String[num][2];
		for (int i = 0; i < num; i++) {
			agename[i][0] = sc.next();
			agename[i][1] = sc.next();
		}
		Arrays.sort(agename, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});

		for (int k = 0; k < num; k++) {
			System.out.println(agename[k][0] + " " + agename[k][1]);
		}

	}
}
