package tomorrow;

import java.util.HashSet;

public class VisitLenght {

	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		String dirs1 = "LULLLLLLU";

		System.out.println(solution(dirs));
		System.out.println(solution(dirs1));
	}

	public static int solution(String dirs) {
		int answer = 0;

		int x = 0;
		int y = 0;
		
		HashSet<String> hs = new HashSet<>();

		for (Character dir : dirs.toCharArray()) {
			int lastX = x;
			int lastY = y;

			if (dir == 'U' && y + 1 <= 5) {
				y++;
			}
			if (dir == 'D' && y - 1 >= -5) {
				y--;
			}
			if (dir == 'R' && x + 1 <= 5) {
				x++;
			}
			if (dir == 'L' && x - 1 >= -5) {
				x--;
			}
			// 중복 확인
			if (lastX == x && lastY == y) {
				continue;
			}

			// 양방향 다 넣어주기
			hs.add(lastX + "" + lastY + "" + x + "" + y);
			hs.add(x + "" + y + "" + lastX + "" + lastY);
		}

		answer = hs.size() / 2;

		return answer;
	}

}
