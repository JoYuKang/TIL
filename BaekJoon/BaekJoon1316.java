package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		int group = num;

		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
			boolean[] check = new boolean[26];
			for (int j = 1; j < str[i].length(); j++) {
				if ((j - 1) == 0) {
					check[str[i].charAt(j - 1) - 'a'] = true;
				}
				if (str[i].charAt(j - 1) != str[i].charAt(j)) {
					int checker = str[i].charAt(j) - 'a';
					if (check[checker]) {
						group--;
						break;
					}
					check[checker] = true;
				}
			}
		}
		System.out.println(group);
	}
}
