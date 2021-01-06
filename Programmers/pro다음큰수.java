package todaytest;

import java.util.Arrays;

public class pro다음큰수 {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n));
    }

    static public int solution(int n) {
        int answer = 0;
        int temp = 0;
        int tempCount = 0;
        String an = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < an.length(); i++) {
            if (an.charAt(i) == '1') {
                count++;
            }
        }

        for (temp = n + 1; count != tempCount; temp++) {
            String tmpToBinary = Integer.toBinaryString(temp);
            tempCount = 0;
            for (int i = 0; i < tmpToBinary.length(); i++) {
                if (tmpToBinary.charAt(i) == '1') tempCount++;
            }
        }
        answer = temp - 1;

        return answer;
    }
}
