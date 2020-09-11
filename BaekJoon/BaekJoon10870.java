package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10870 {
	public static long fn(int a) {

		if (a <= 1) {
			return a;
		} else {
			return fn(a - 1) + fn(a - 2);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(fn(num));
	}
}
