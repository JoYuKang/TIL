package hash;

import java.util.HashMap;
import java.util.Scanner;

public class 학급_회장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int answer = 0;
        for (Character character : hashMap.keySet()) {
            answer = Math.max(answer, hashMap.get(character));
        }

        System.out.println(answer);
    }
}
