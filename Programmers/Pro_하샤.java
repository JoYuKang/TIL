package todaytest;

public class Pro_하샤 {
    public static void main(String[] args) {
        int x = 11;
        System.out.println(solution(x));
    }

    static public boolean solution(int x) {
        boolean answer = false;
        String arr = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < arr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(arr.charAt(i)));
        }
        if(x%sum==0){
            answer = true;
        }


        return answer;
    }
}
