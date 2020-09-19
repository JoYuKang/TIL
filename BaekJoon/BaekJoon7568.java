package tomorrow;

import java.util.Scanner;

public class BaekJoon7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[][] num = new int[s][2];
		int rank[] = new int[s];

		for (int i = 0; i < s; i++) {
			rank[i] = 1;
			num[i][0] = sc.nextInt(); // ¸ö¹«°Ô
			num[i][1] = sc.nextInt(); // Å°
		}

		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				if (num[i][0] > num[j][0] && num[i][1] > num[j][1]) {
					rank[j]++;
				}
			}
		}
		for (int k = 0; k < rank.length; k++) {
			System.out.print(rank[k]+" ");
		}
	}
}
