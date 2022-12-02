package hash;

import java.util.HashMap;
import java.util.Scanner;

public class 모든_아나그램_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        String text = sc.next();
        String target = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> targetMap = new HashMap<>();
        int lt = 0;
        int rt = target.length() - 1;

        for (int i = 0; i < target.length(); i++) {
            targetMap.put(target.charAt(i), targetMap.getOrDefault(target.charAt(i), 0) + 1);
        }
        for (int i = 0; i < rt; i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }
        for (int i = rt; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
            if (targetMap.equals(map)) {
                answer++;
            }
//            for (int j = 0; j < targetMap.size(); j++) {
//                if (targetMap.get(target.charAt(j)) != map.getOrDefault(target.charAt(j), 0)) {
//                    check = false;
//                    break;
//                }
//            }

            map.put(text.charAt(lt), map.get(text.charAt(lt)) - 1);
            if (map.get(text.charAt(lt)) == 0) {
                map.remove(text.charAt(lt));
            }
            lt++;
        }
        System.out.println(answer);
    }
}
