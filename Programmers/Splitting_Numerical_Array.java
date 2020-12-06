package Pro;

import java.util.ArrayList;
import java.util.Collections;

public class Splitting_Numerical_Array {
    public static void main(String[] args) {
        int[] arr= {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(solution(arr,divisor));
    }
    static public ArrayList solution(int[] arr, int divisor) {
        ArrayList answer = new ArrayList();
        for (int j : arr) {
            if (j % divisor == 0) {
                answer.add(j);
            }
        }

        if (answer.size()==0){
             answer.add(-1);
        }else{
            Collections.sort(answer);
        }
            return answer;



    }
}
