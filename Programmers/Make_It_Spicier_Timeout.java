package tomorrow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Make_It_Spicier_Timeout {
	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };

		int K = 7;

		System.out.println(solution(scoville, K));

	}

	public static int solution(int[] scoville, int K) {
		int answer = 1;
		Arrays.sort(scoville);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < scoville.length; i++) {
			arr.add(scoville[i]);
		}

		while (true) {
			Collections.sort(arr);

			int a = arr.get(0) + arr.get(1) * 2;
			arr.add(a);

			arr.remove(0);
			arr.remove(0);
			Collections.sort(arr);

//			if (arr.get(0) < K) {
//				
//				continue;
//			} 
			 if (arr.get(0) >= K) {
				break;
			} else if (arr.get(0) < K &&arr.size() < 2) {
				answer = -1;
				break;
			}

			answer++;

		}

		return answer;
	}

}
