package tomorrow;

import java.util.Scanner;

public class WaterMelon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		solution(s);
		
	}

	public static StringBuffer solution(int n) {
		StringBuffer answer = new StringBuffer();
		int z = n;
		char s = '¼ö';
		char b = '¹Ú';
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < z; i++) {
			if(i%2==0) {
				sb.append(s);
			}else {
				sb.append(b);
			}
		}
		answer = sb;
		System.out.println(answer);
		return answer;
	}

}
