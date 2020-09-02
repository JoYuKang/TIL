package java_test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String T = bf.readLine();
		StringTokenizer st = new StringTokenizer(T);
		int a = Integer.parseInt(st.nextToken());
		for (int z = 0; z < a; z++) {
			String x = bf.readLine();

			st = new StringTokenizer(x);
			int c = Integer.parseInt(st.nextToken());

			String y = bf.readLine();
			st = new StringTokenizer(y);
			int d = Integer.parseInt(st.nextToken());

			bw.write(c + d + "\n");
			bw.flush();
			
		}
		
		bw.close();

	}

}
