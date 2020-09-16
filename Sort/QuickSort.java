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
			while (i <= r) { // ������������
				while (s[i] <= s[l]) { // Ű ������ ū ���� ������ ���� �̵�
					i++;
				} // ���ʸ� �Ű澸
				while (s[r] >= s[l] && r > str) { // Ű ������ ���� ���� ������ ���� �̵�
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
