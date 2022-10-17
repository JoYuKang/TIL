package String;

import java.util.Scanner;

public class 문자찾기 {

    public static int solution(String str, char target){
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char target = sc.nextLine().charAt(0);
        str = str.toLowerCase();
        target = Character.toLowerCase(target);

        System.out.println(solution(str, target));
    }
}
