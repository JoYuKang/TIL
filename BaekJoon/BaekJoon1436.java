package tomorrow;

import java.util.Scanner;

public class BaekJoon1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		int num =0;
		while(z > 0) {
            num++;
            String str = Integer.toString(num);   // int to string Çüº¯È¯
            if(str.contains("666")) 
                z--;
        }
		System.out.println(num);
	}
}
