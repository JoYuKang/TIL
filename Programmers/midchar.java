package Pro;

public class midchar {
    public static void main(String[] args) {
        String s = "abczde";
        System.out.println(solution(s));
    }

    static public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = s.length() / 2;
        System.out.println(count);


        if (s.length() % 2 == 0) {
            answer.append(s.charAt(count - 1));
            answer.append(s.charAt(count));
        }else{
            answer.append(s.charAt(count));
        }


        return answer.toString();
    }
}
