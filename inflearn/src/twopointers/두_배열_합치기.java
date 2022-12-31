package twopointers;

import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기 {

    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            }else{
                answer.add(arr2[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(arr1[p1++]);
        }

        while (p2 < m) {
            answer.add(arr2[p2++]);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }


        ArrayList<Integer> solution = solution(n, m, arr1, arr2);
        
        String s = "";

        for (int i = 0; i < solution.size(); i++) {
            s += solution.get(i) +" ";
        }
        System.out.println(s);
    }
}
