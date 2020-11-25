package tomorrow;

public class JadenCase {
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(solution(s));
	}

	static public String solution(String s) {
		boolean isNextUpper = true;
		StringBuffer sb = new StringBuffer();

		for (int inx = 0; inx < s.length(); inx++) {
			char c = s.charAt(inx); // 한글자씩 계산
			if (inx == 0 || isNextUpper) {
				sb.append(Character.toUpperCase(c));
				isNextUpper = false;
			} else {
				sb.append(Character.toLowerCase(c));
			}

			if (c == ' ') {
				isNextUpper = true;
			}
		}
		return sb.toString();
	}
}
