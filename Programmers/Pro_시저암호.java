package todaytest;

public class Pro_시저암호 {
    public static void main(String[] args) {
        String s = "z";
        int n = 6;
        System.out.println(solution(s, n));
    }

    static public StringBuilder solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c + n > 'Z') {
                    answer.append((char) (c + n + 6));
                } else {
                    answer.append((char) (c + n));
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c + n > 'z') {
                    answer.append((char) (c + n - 26));
                } else {
                    answer.append((char) (c + n));
                }

            } else {
                answer.append(c);
            }

        }


        return answer;
    }
}
