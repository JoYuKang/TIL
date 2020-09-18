package tomorrow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class BaekJoon9020_timeout {

	public static void main(String[] args) throws IOException {
		{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			TreeSet<Integer> as = new TreeSet<>();

			for (int i = 0; i < num; i++) {
				int a = sc.nextInt();
				int st = 0, en = 0;
				for (int j = 2; j < a; j++) {
					int count = 0;
					for (int k = 2; k <= a; k++) {
						if (j % k == 0) {
							count++;
						}
					}
					if (count == 1) {
						as.add(j);
					}
				}
				ArrayList<Integer> ar = new ArrayList<Integer>(as);
//			for (Integer s : ar) { // for문을 통한 전체출력
//				System.out.print(s + " ");
//			}
//			System.out.println();
				for (int j = 0; j < ar.size(); j++) {
					for (int k = j; k < ar.size(); k++) {
						if (a == (ar.get(j) + ar.get(k))) {
							st = ar.get(j);
							en = ar.get(k);
						}
					}
				}
				System.out.println(st + " " + en);
			}

		}
	}
}
