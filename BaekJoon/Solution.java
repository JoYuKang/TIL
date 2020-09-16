package tomorrow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 4, 1 };

		System.out.println(Arrays.toString(solution(a)));
	}

	public static int[] solution(int[] arr) {

		ArrayList<Integer> tr = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				tr.add(arr[i] + arr[j]);
			}
		}
//		for (int i : tr) {
//			System.out.print(i + "\t");
//		}
//		System.out.println();

		// Collections.sort(tr);
		TreeSet<Integer> t = new TreeSet<Integer>(tr);
//		for (int i : t) {
//			System.out.print(i + "\t");
//		}
//		System.out.println();
		ArrayList<Integer> end = new ArrayList<Integer>(t);
//		for (int i : end) {
//			System.out.print(i + "\t");
//		}
//		System.out.println();
		int[] answer = new int[t.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = end.get(i).intValue();
		}
//		for (int i : answer) {
//			System.out.print(i + "\t");
//		}
//		System.out.println();
		return answer;
	}
}