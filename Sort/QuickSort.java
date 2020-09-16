package tomorrow;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = new int[] { 7, 8, 6, 9, 2, 10 };
		int tmp = a.length;
		quick(a, 0, tmp - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static int quick(int s[], int str, int end) {
		if (str >= end) {
			return 0;
		} else {
			int l = str;
			int i = str + 1;
			int r = end;
			while (i <= r) { // 엇갈릴때까지
				while (s[i] <= s[l]) { // 키 값보다 큰 값을 만날때 까지 이동
					i++;
				} // 왼쪽만 신경씀
				while (s[r] >= s[l] && r > str) { // 키 값보다 작은 값을 만날때 까지 이동
					r--;
				}
				if (i > r) {
					int temp = s[r];
					s[r] = s[l];
					s[l] = temp;
				} else {
					int temp = s[r];
					s[r] = s[i];
					s[i] = temp;
				}
			}
			quick(s, str, r - 1);
			quick(s, r + 1, end);
		}
		return 0;
	}

}
