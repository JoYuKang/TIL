package tomorrow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon6588 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		boolean a[] = new boolean[1000000];
		for (int i = 0; i <= a.length-1; i++) {
			a[i] = false;
		}
		a[0] = true;
		a[1] = true;

		for (int i = 2; i <= a.length; i++) {
			for (int j = 2; i * j <= a.length-1; j++) {
				a[i * j] = true;
			}
		}
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) {
				break;}
			
			for (int i = 1; i > 0; i++) {
				int mid1 = i;
				int mid2 = n-i;
				if (!a[mid1] && !a[mid2]) {
					sb.append(n +" = " + mid1 + " + " + mid2 + "\n");
					break;
				}
				
			}
		}
		System.out.println(sb.toString());
	}
}