package tomorrow;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTest {
	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution(answers)));
	}

	static public int[] solution(int[] answers) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % a.length]) {
				count1++;
			}
			if (answers[i] == b[i % b.length]) {
				count2++;
			}
			if (answers[i] == c[i % c.length]) {
				count3++;
			}
		}
		int largest = Math.max(Math.max(count1, count2), count3);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if (count1 == largest) {
			ans.add(1);
		}
		if (count2 == largest) {
			ans.add(2);
		}
		if (count3 == largest) {
			ans.add(3);
		}
		int[] answer = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			answer[i] = ans.get(i);
		}
		return answer;
	}

}
