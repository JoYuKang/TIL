package Pro;


import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int numbers[] = {6, 10, 2};
        System.out.println(solution(numbers));
    }

    static public String solution(int[] numbers) {
        String answer = "";

        String[] ar = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ar[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        // 0만 여러개 있는 배열의 경우 하나의 0만 리턴
        if (ar[0].equals("0")) {
            return "0";
        }
        // 정렬된 문자 하나로 합치기
        for (String a : ar) {
            answer += a;
        }
        return answer;
    }
}
