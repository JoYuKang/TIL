package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon1920 {
	// ¼ö Ã£±â
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuffer sb = new StringBuffer();

		int num1 = Integer.parseInt(br.readLine());

		int arr1[] = new int[num1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < num1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		int num2 = Integer.parseInt(br.readLine());

		int[] arr2 = new int[num2];

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < num2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr1);

		for (int t = 0; t < arr2.length; t++) {
			int index = Arrays.binarySearch(arr1, arr2[t]);
			if (index < 0) {
				sb.append(0 + "\n");
			} else {
				sb.append(1 + "\n");
			}
		}
		System.out.println(sb);

	}
}
