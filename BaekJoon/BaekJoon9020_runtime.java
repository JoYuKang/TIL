package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9020_runtime {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[1229];
		int co = 0;
		for (int j = 2; j < 10000; j++) {
			int count = 0;

			for (int k = 2; k <= j; k++) {
				if (j % k == 0) {
					count++;
				}
			}
			if (count == 1) {
				n[co] = j;
				co++;
			}
		}

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			int g = Integer.parseInt(br.readLine());
			int count = 0;
			int st = 0;
			int en = 0;
			int sum = 0;
			for (int h = 0; n[h] < g; h++) {
				count++;
			}
			for (int k = 0; k <= count; k++) {
				for (int l = k; l <= count; l++) {
					if (g == n[k] + n[l]) {
						if (sum >= Math.abs(st - en)) {
							st = n[k];
							en = n[l];
							sum = Math.abs(st - en);
						}
					}
				}
			}
			System.out.println(st + " " + en);
		}

	}
}
