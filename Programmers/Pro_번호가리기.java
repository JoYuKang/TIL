package todaytest;

public class Pro_번호가리기 {
    public static void main(String[] args) {
        String phone_number = "027778888";
        System.out.println(solution(phone_number));
    }

    static public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer.append("*");
        }
        for (int i = phone_number.length() - 4; i < phone_number.length() ; i++) {
            answer.append(phone_number.charAt(i));
        }
        return answer.toString();
    }
}
