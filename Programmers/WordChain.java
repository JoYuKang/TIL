package tomorrow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordChain {
	public static void main(String[] args) {
		int n1 = 3;
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		String[] words2 = { "hello", "one", "even", "never", "now", "world", "draw" };
		String[] words1 = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
		int n2 = 5;
		int n3 = 2;
		System.out.println(Arrays.toString(solution(n1, words)));
		System.out.println(Arrays.toString(solution(n2, words1)));
		System.out.println(Arrays.toString(solution(n3, words2)));

	}

	public static int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };
		List<String> an = new LinkedList<>();
		boolean flag = true;
		for (int i = 0; i < words.length; i++) {

			if (an.contains(words[i])) { 
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				flag = false;
				break;
			}
			an.add(words[i]);
			
			if (i > 0) {
				char e = words[i - 1].charAt(words[i - 1].length() - 1);
				char s = words[i].charAt(0);

				if (e != s) {

					answer[0] = i % n + 1;
					answer[1] = i % n + 1 > 1 ? (i / n) + 1 : (i / n) + 1;
					flag = false;
					break;
				}
			}

		}
		if (flag)
			return new int[] { 0, 0 };
		return answer;
	}
}
