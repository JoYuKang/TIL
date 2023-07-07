package src.array;

import java.util.Scanner;

public class 에라토스테네스 {
    static boolean[] isPrime;

    public static void setPrime(boolean[] prime) {
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= 100000; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime = new boolean[num];
        setPrime(isPrime);
    }
}
