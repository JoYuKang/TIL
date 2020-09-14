package tomorrow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BaekJoon10826 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		BigInteger n1 = BigInteger.ZERO;
		BigInteger n2 = BigInteger.ONE;
		BigInteger n3 = BigInteger.ZERO;
		if (num == 0) {
			n3 = BigInteger.ZERO;
		} else if (num <= 2 && num != 0) {
			n3 = BigInteger.ONE;
		} else {
			for (int i = 2; i <= num; i++) {
				n3 = n1.add(n2);
				n1 = n2;
				n2 = n3;
			}
		}
		bw.write(n3 + "");
		System.out.print(n3);
	}

}