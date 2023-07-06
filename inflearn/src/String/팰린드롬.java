package src.String;

import java.util.Scanner;

public class 팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
    public static String solution(String str){

        // A-Z가 아닌 문자열은 빈문자열로 변환
        str = str.toUpperCase().replaceAll("[^A-Z]",""); // replaceAll은 정규식 사용 가능
        String test = new StringBuilder(str).reverse().toString();

        if (str.equals(test)) {
            return "YES";
        }
        return "NO";
    }
}
