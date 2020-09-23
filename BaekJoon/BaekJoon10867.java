package tomorrow;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class BaekJoon10867 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> ar1 = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			ar1.add(sc.nextInt());
		}
		TreeSet<Integer> set = new TreeSet<Integer>(ar1);

		ArrayList<Integer> ar2 = new ArrayList<Integer>(set);

		for (int i = 0; i < ar2.size(); i++) {
			System.out.print(ar2.get(i) + " ");
		}
	}
}
