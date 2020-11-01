package tomorrow;

public class Hellopython {
	public static void main(String[] args) {

		String encrypted_text = "qyyigoptvfb";
		String key = "abcdefghijk";
		int rotation = 3;
		System.out.println(solution(encrypted_text, key, rotation));

	}

	static public String solution(String encrypted_text, String key, int rotation) {
		String answer = "";
		char ch[] = new char[encrypted_text.length()];
		int keych[] = new int[key.length()];

		for (int i = 0; i < encrypted_text.length(); i++) {
			ch[i] = encrypted_text.charAt(i);
		}
		for (int i = 0; i < key.length(); i++) {
			keych[i] = key.charAt(i) - 96;
		}
		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i]);

		}
//		System.out.println();
//		for (int i = 0; i < keych.length; i++) {
//
//			System.out.print(keych[i]);
//
//		}
		if (rotation < 0) {
			for (int r = rotation; r < 0; r++) {
				char temp = ch[ch.length - 1];
				for (int i = encrypted_text.length() - 1; i >= 1; i--) {
					ch[i] = ch[i - 1];
				}
				ch[0] = temp;
			}
		}
		if (rotation > 0) {
			for (int r = rotation; r > 0; r--) {
				char temp = ch[0];
				for (int i = 0; i < ch.length - 1; i++) {
					ch[i] = ch[i + 1];
				}
				ch[ch.length - 1] = temp;
			}
		}
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		// int num = keych[6];
		//System.out.println("num = " + num);
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] - keych[i]) > 96 && ch[i] - keych[i] < 122) {
				ch[i] = (char) (ch[i] - keych[i]);
			} else if (ch[i] - keych[i] < 97) {
				int num = 97 - ch[i] + keych[i];
				ch[i] = (char) (123 - num);
			}

		}

		for (int i = 0; i < key.length(); i++) {
			answer += ch[i];
		}
		return answer;

	}

}
