package tomorrow;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] a = { 7, 8, 6, 9, 2, 10 };
		insert(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	static int insert(int a[]) {
		int k;
		for (int i = 0; i < a.length - 1; i++) {
			k = i;
			while (a[k] > a[k + 1]) {
				int temp = a[k];
				a[k] = a[k + 1];
				a[k + 1] = temp;
				if (k != 0) {
					k--;
				}
			}
		}

		return 0;
	}
}
