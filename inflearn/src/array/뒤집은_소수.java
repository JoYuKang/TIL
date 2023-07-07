package src.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은_소수 {

    static boolean[] isPrime = new boolean[100001];

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
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        setPrime(isPrime);
        System.out.println(solution(num, arr));
    }



    public static String solution(int num, int[] arr){
        List<Integer> list = new ArrayList<>();

        String answer = "";

        for (int i : arr) {
            int temp = i;
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }
            list.add(res);
        }

        for (Integer integer : list) {
            if (!isPrime[integer]) {
                answer += integer + " ";
            }
        }

        return answer;
    }
}
