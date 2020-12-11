package todaytest;

public class Pro_김서방 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    static public String solution(String[] seoul) {
        int n = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                n = i;
                break;
            }
        }


        return "김서방은 " + n + "에 있다";
    }
}
