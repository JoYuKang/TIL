package pro;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class 주차_요금_계산 {
    public static List solution(int[] fees, String[] records) throws ParseException {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, String > map = new HashMap<>();
        HashMap<String, Integer> feeMap = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        for (String record : records) {
            String time = record.substring(0, 5);
            String number = record.substring(6, 10);
            String check = record.substring(11);
            if (check.equals("IN")) {
                map.put(number, time);
            }else {
                String in = map.get(number);
                map.remove(number);
                long start = sdf.parse(in).getTime();
                long end = sdf.parse(time).getTime();
                int feeTime = (int) ((end - start) / (1000 * 60));
                feeMap.put(number, feeMap.getOrDefault(number, 0) + feeTime);
            }
        }
        for (String s : map.keySet()) {
            long start = sdf.parse(map.get(s)).getTime();
            long end = sdf.parse("23:59").getTime();
            int feeTime = (int) ((end - start) / (1000 * 60));
            feeMap.put(s, feeMap.getOrDefault(s, 0) + feeTime);
        }

        List<String> keyList = new ArrayList<>(feeMap.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        for (String key : keyList) {
            if (feeMap.get(key) < fees[0]) {
                answer.add(fees[1]);
                continue;
            }

            int cost = (feeMap.get(key) - fees[0]) / fees[2];
            if ((feeMap.get(key) - fees[0]) % fees[2] > 0) {
                cost++;
            }

            int i = fees[1] + cost* fees[3];
            answer.add(i);
        }

        return answer;
    }
    public static void main(String[] args) throws ParseException {
        int[] fee = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(solution(fee, records));
    }
}
