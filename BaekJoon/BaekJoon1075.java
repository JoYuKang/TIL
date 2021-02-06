package todaytest;

import java.util.Scanner;

public class BaekJoon1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        num = (num/100)*100;
        int sum = 0;
        while (num % a != 0) {
           num++;
           sum++;
        }
        if(sum<10){
            System.out.println("0"+sum);
        }else{
            System.out.println(sum);
        }

    }
}
