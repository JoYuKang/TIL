package twopointers;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class 최대_매출 {



    public static int solution(int num,int[] arr){
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = num; i < arr.length; i++) {
            sum += arr[i] - arr[i - num];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int[] arr = new int[input1];
        for (int i = 0; i < input1; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(solution(input2, arr));
    }
}
