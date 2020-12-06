package Pro;

public class NumberPlus {
    public static void main(String[] args) {
        int n = 987;
        System.out.println(solution(n));
    }


    static public int solution(int n) {
        int answer = 0;
        String s =String.valueOf(n);

        for(int i =0;i<s.length();i++){
            answer+=Integer.parseInt(String.valueOf(s.charAt(i)));
            
        }

        return answer;
    }
}
