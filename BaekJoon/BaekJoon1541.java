package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1541 {
	// ÀÒ¾î¹ö¸° °ýÈ£
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();
		StringTokenizer st = new StringTokenizer(n, "-");
		int num = st.countTokens();
		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = st.nextToken();
		}
		int sum = 0;
		int cl = 0;

		for (int k = 0; k < str.length; k++) {
			if (str[k].contains("+") || k == 0) {
				if (k != 0) {
					StringTokenizer a = new StringTokenizer(str[k], "+");
					int[] z = new int[a.countTokens()];
					for (int i = 0; i < z.length; i++) {
						z[i] = Integer.parseInt(a.nextToken());
						cl += z[i];
					}
				}
				if (k == 0) {
					StringTokenizer a = new StringTokenizer(str[k], "+");
					int[] z = new int[a.countTokens()];
					for (int i = 0; i < z.length; i++) {
						z[i] = Integer.parseInt(a.nextToken());
						sum += z[i];
					}
				}

			} else if (!str[k].contains("+") && k != 0) {
				cl += Integer.parseInt(str[k]);
			}
		}
		System.out.println(sum - cl);
	}
}