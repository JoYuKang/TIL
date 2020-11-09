package tomorrow;

import java.util.Arrays;

public class Lifeboat {
	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50 };
		int limit = 100;
		int[] people1 = { 70, 80, 50 };
		System.out.println(solution(people, limit));
		System.out.println(solution(people1, limit));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		int right = people.length - 1;
		int left = 0;

		while (right >= left) {
			int weight = people[right--];
			if (weight + people[left] <= limit) {
				left++;
			}
			answer++;
		}

		return answer;
	}
}