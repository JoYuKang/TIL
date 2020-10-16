package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1744_ex {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int minusCnt = 0;
		int plusCnt = 0;
		int oneCnt = 0;
		int sum = 0;
		int i;

		for (int j = 0; j < n; j++) {
			a[j] = Integer.parseInt(br.readLine());
			if (a[j] == 1)
				oneCnt++;
			else if (a[j] <= 0)
				minusCnt++;
			else
				plusCnt++;
		}

		Arrays.sort(a);

		for (i = 0; i + 1 < minusCnt; i += 2) {
			sum += a[i] * a[i + 1];
		}

		for (; i < minusCnt; i++) {
			sum += a[i];
		}

		sum += oneCnt;
		i += oneCnt;

		if (plusCnt % 2 == 1) {
			sum += a[i];
			i++;
		}

		for (; i + 1 < n; i += 2) {
			sum += a[i] * a[i + 1];
		}

		System.out.println(sum);
	}

}
