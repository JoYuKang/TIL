package tomorrow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num; i++) {
			ar.add(sc.nextInt());
		}

		Collections.sort(ar);

		for (int i = 0; i < ar.size(); i++) {
			sb.append(ar.get(i) + "\n");
		}
		
		System.out.println(sb);
	}
}