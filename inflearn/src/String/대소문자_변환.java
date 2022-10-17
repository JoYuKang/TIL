package String;

import java.util.Scanner;

public class 대소문자_변환 {

    public static String solution(String input){
        String answer = "";
        char[] chars = input.toCharArray();
        for(char c : chars){
            if (c < 91){
                answer += Character.toLowerCase(c);
            }else {
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();

        System.out.println(solution(input));
    }
}
