package todaytest;

import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = b.add(a);

        System.out.println(c);

    }
}
