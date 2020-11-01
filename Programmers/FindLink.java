package pro;

import java.util.LinkedList;
import java.util.List;

public class FindLink {
	public static void main(String[] args) {
		int n = 6;
		int[][] delivery = { { 1, 3, 1 }, { 3, 5, 0 }, { 5, 4, 0 }, { 2, 5, 0 } };
		System.out.println(solution(n, delivery));

		n=7;
		int[][] delivery1 = {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}};
		System.out.println(solution(n, delivery1));

	}

	public static StringBuffer solution(int n, int[][] delivery) {
		StringBuffer answer = new StringBuffer();
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> list3 = new LinkedList<Integer>();
		for (int i = 0; i < delivery.length; i++) {
			if (delivery[i][2] == 1) {
				list1.add(delivery[i][0]);
				list1.add(delivery[i][1]);
			} else if (delivery[i][2] == 0) {

				if (list1.contains(delivery[i][0])) {
					list3.add(delivery[i][1]);
				} else if (list1.contains(delivery[i][1])) {
					list3.add(delivery[i][0]);
				} else {
					list2.add(delivery[i][0]);
					list2.add(delivery[i][1]);
				}

			}
		}
		for (int i = 0; i < delivery.length; i++) {
			if (delivery[i][2] == 1) {
				list1.add(delivery[i][0]);
				list1.add(delivery[i][1]);
			} else if (delivery[i][2] == 0) {

				if (list1.contains(delivery[i][0])) {
					list3.add(delivery[i][1]);
				} else if (list1.contains(delivery[i][1])) {
					list3.add(delivery[i][0]);
				} else {
					list2.add(delivery[i][0]);
					list2.add(delivery[i][1]);
				}

			}
		}
		for (int i = 1; i <= n; i++) {
			if (list1.contains(i)) {
				answer.append("O");
			} else if (list3.contains(i)) {
				answer.append("X");
			} else {
				answer.append("?");
			}

		}

		return answer;

	}
}
