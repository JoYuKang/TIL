package tomorrow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BaekJoon9020 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int st = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int z = 0; z < st; z++) {
			int n = Integer.parseInt(br.readLine());
			boolean a[] = new boolean[n + 1];
			for (int i = 0; i <= n; i++) {
				a[i] = false;
			}
			a[0] = true;
			a[1] = true;

			for (int i = 2; i <= n; i++) {
				for (int j = 2; i * j <= n; j++) {
					a[i * j] = true;
				}
			}
			for (int i = n / 2; i > 0; i--) {
				int mid1 = i;
				int mid2 = n - i;
				if (!a[mid1] && !a[mid2]) {
					sb.append(mid1 + " " + mid2 + "\n");
					break;

				}
			}
		}
		System.out.println(sb.toString());
	}
}