package tomorrow;

public class ExpressKeyboard_f {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "left";
		System.out.println(solution(numbers, hand));
	}

	static public String solution(int[] numbers, String hand) {
		String answer = "";
		StringBuffer sb = new StringBuffer();
		int leftcount = 4;
		int left = 10;
		int rightcount = 4;
		int right = 12;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				if (numbers[i] == 1) {
					leftcount = 1;
					left = 1;
				} else if (numbers[i] == 4) {
					leftcount = 2;
					left = 4;
				} else {
					leftcount = 3;
					left = 7;
				}

				sb.append("L");
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				if (numbers[i] == 3) {
					rightcount = 1;
					right = 3;
				} else if (numbers[i] == 6) {
					rightcount = 2;
					right = 6;
				} else {
					rightcount = 3;
					right = 9;
				}
				sb.append("R");
			} else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
				int count = 0;
				if (numbers[i] == 2) {
					count = 1;
					if (right == 5) {
						rightcount = 1;
					} else if (right == 8) {
						rightcount = 2;
					} else if (right == 0) {
						rightcount = 3;
					} else if (left == 5) {
						leftcount = 1;
					} else if (left == 8) {
						leftcount = 2;
					} else if (left == 0) {
						leftcount = 3;
					}

					if (Math.abs(leftcount - count) > Math.abs(rightcount - count)) {
						sb.append("R");
						rightcount = 1;
						right = 2;
					} else if (Math.abs(leftcount - count) < Math.abs(rightcount - count)) {
						sb.append("L");
						leftcount = 1;
						left = 2;
					} else {
						if (hand.equals("right")) {
							sb.append("R");
							rightcount = 1;
							right = 2;
						} else {
							sb.append("L");
							leftcount = 1;
							left = 2;
						}

					}
				} else if (numbers[i] == 5) {
					count = 2;
					if (right == 2 || right == 8) {
						rightcount = 2;
					} else if (left == 2 || left == 8) {
						leftcount = 2;
					} else if (left == 0) {
						leftcount = 4;
					} else if (right == 0) {
						rightcount = 4;
					}
					if (Math.abs(leftcount - count) > Math.abs(rightcount - count)) {
						sb.append("R");
						rightcount = 2;
						right = 5;
					} else if (Math.abs(leftcount - count) < Math.abs(rightcount - count)) {
						sb.append("L");
						leftcount = 2;
						left = 5;
					} else {
						if (hand.equals("right")) {
							sb.append("R");
							rightcount = 2;
							right = 5;
						} else {
							sb.append("L");
							leftcount = 2;
							left = 5;
						}

					}
				} else if (numbers[i] == 8) {
					count = 3;
					if (right == 5 || right == 0) {
						rightcount = 3;
					} else if (left == 5 || left == 0) {
						leftcount = 3;
					} else if (left == 2) {
						leftcount = 1;
					} else if (right == 2) {
						rightcount = 1;
					}
					if (Math.abs(leftcount - count) > Math.abs(rightcount - count)) {
						sb.append("R");
						rightcount = 3;
						right = 8;
					} else if (Math.abs(leftcount - count) < Math.abs(rightcount - count)) {
						sb.append("L");
						leftcount = 3;
						left = 8;
					} else {
						if (hand.equals("right")) {
							sb.append("R");
							rightcount = 3;
							right = 8;
						} else {
							sb.append("L");
							leftcount = 3;
							left = 8;
						}

					}
				} else if (numbers[i] == 0) {
					count = 4;
					if (right == 8) {
						rightcount = 4;
					} else if (left == 8) {
						leftcount = 4;
					} else if (left == 5) {
						leftcount = 2;
					} else if (right == 5) {
						rightcount = 2;
					} else if (left == 2) {
						leftcount = 1;
					} else if (right == 2) {
						rightcount = 1;
					}

					if (Math.abs(leftcount - count) > Math.abs(rightcount - count)) {
						sb.append("R");
						rightcount = 4;
						right = 0;
					} else if (Math.abs(leftcount - count) < Math.abs(rightcount - count)) {
						sb.append("L");
						leftcount = 4;
						left = 0;
					} else {
						if (hand.equals("right")) {
							sb.append("R");
							rightcount = 4;
							right = 0;
						} else {
							sb.append("L");
							leftcount = 4;
							left = 0;
						}

					}
				}
			}

		}
		answer = sb.toString();
		return answer;
	}
}