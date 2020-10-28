package tomorrow;

public class Calendar {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(solution(a, b));
	}

	static public String solution(int a, int b) {
		String answer = "";
		String[] arr = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] ar = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int date = 0;

		for (int i = 0; i < a - 1; i++) {
			date += ar[i];
		}
		date = date + b - 1;
		answer = arr[date % 7];
		return answer;
	}
}
