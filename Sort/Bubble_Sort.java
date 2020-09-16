package tomorrow;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] a = { 7, 8, 6, 9, 2, 10 };
		bub(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	static int bub(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		return 0;
	}
}
