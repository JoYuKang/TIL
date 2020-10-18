package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon2437 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int min = 1;
		for (int i = 0; i < arr.length; i++) {
			if (min < arr[i]) {
				break;
			} else {
				min += arr[i];
			}
		}
		System.out.println(min);

	}

}
