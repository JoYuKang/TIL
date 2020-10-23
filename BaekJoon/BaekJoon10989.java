package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for (int i = 0; i < num; i++) {
			sb.append(arr[i]).append('\n');
		}

		System.out.println(sb);
	}

}
