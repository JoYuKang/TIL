package tomorrow;

import java.util.Scanner;

public class BaekJoon1003 {
	// fibonacci
	static int[] dp = new int[41];	
	public int fibonacci(int n) {
		if(n <= 1 || dp[n] != 0) 
			return dp[n];
		else
			return dp[n] = fibonacci(n-1) + fibonacci(n-2);
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 0; i < testCase; i++) {
			int num = sc.nextInt();
			new BaekJoon1003().fibonacci(num);
			
			if(num == 0)
				System.out.println(1 + " " + 0);
			else if(num == 1)
				System.out.println(0 + " " + 1);
			else
				System.out.println(dp[num-1] + " " + dp[num]);
		}
	}
}
