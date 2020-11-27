package com.company;

import java.util.*;

public class opench {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }

    static public String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<>();

        for (String value : record) {
            String[] split = value.split(" ");
            if (!split[0].equals("Leave"))
                map.put(split[1], split[2]);
        }
        for (String s : record) {
            String[] split = s.split(" ");
            if (split[0].equals("Enter")) {
                list.add(map.get(split[1]) + "님이 들어왔습니다.");
            } else if (split[0].equals("Leave")) {
                list.add(map.get(split[1]) + "님이 나갔습니다.");
            }
        }
        answer = new String[list.size()];
        for(int i = 0 ; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
