package todaytest;

import java.util.Arrays;


public class Pro_완주선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"mislav", "ana", "stanko"};
        System.out.println(solution(participant, completion));
    }

    static public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {

                return participant[i];
            }
        }

        return participant[i];
    }
}
