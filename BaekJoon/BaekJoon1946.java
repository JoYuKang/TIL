package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());

		while (num-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			int[] arr = new int[n + 1];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x] = y;

			}
			int count = 1;
			int min = arr[1];
			for (int i = 2; i <= n; i++) {
				if (arr[i] <= min) {
					count++;
					min = arr[i];
				}
			}
			System.out.println(count);
		}

	}
}
