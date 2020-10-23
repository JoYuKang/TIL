package tomorrow;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());

		for (int i = 0; i < num ; i++) {
			String input = sc.next();

			String str = "YES";

			Stack<Integer> st = new Stack<>();
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == '(') {

					st.push(1);

				} else if (input.charAt(j) == ')') {
					if (st.isEmpty()) {
						str = "NO";
						break;
					} else {
						st.pop();
					}
				}

			}
			if (!st.isEmpty()) {
				str = "NO";
			}
			System.out.println(str);
		}

	}
}