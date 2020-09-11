package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2747 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		if (num <= 2) {
			n3 = 1;
		} else {
			for (int i = 2; i <= num; i++) {
				n3 = n1 + n2; // 0 + 1 // 1 + 2 // 2 + 3 // 3 + 5 // 5 + 8 ...
				n1 = n2; // 1 // 2 // 3 // 5 // 8 ...
				n2 = n3; // 2 // 3 // 5 // 8 // 13 ...
			}
		}
		System.out.println(n3);

	}
}
