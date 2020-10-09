package tomorrow;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10773 {
	//zero
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		int sum = 0;
		num--;
		while (num-- >= 0) {
			int a = sc.nextInt();
			if (a == 0) {
				st.pop();
			} else {
				st.add(a);
			}
		}
		for (int i = 0; i < st.size(); i++) {
			sum += st.get(i);
		}
		System.out.println(sum);
	}
}
