package tomorrow;

import java.util.ArrayList;

public class PromgrammersHateSameNum {
	public static void main(String[] args) {
		int[] ar = { 1, 1, 3, 3, 0, 1, 1 };
		int[] aj = { 4, 4, 4, 3, 3 };
		solution(ar);
		System.out.println();
		solution(aj);
	}

	public static int[] solution(int[] arr) {
		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp.add(arr[i]);
			}
		}
		if (arr[arr.length - 2] != arr[arr.length - 1]) {
			temp.add(arr[arr.length - 1]);
		} else if (arr[arr.length - 2] == arr[arr.length - 1]) {
			temp.add(arr[arr.length - 2]);
		}
		int[] answer = new int[temp.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		return answer;
	}
}
