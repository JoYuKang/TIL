package Pro;

public class Between_sum_of_two_integers {
    public static void main(String[] args) {
        int a =3;
        int b =5;
        System.out.println(solution(a,b)); 
    }
    static public long solution(int a, int b) {
        long answer = 0;
        if (a != b) {
            if(a>b){
                for(int i = b;i<=a;i++){
                    answer += i;
                }
            }else {  
                for(int i = a;i<=b;i++){
                    answer += i;
                }
            }
        } else {
            answer = a;
        }



        return answer;
    }
}
