package tomorrow;

public class HeapSort {

	public static void main(String[] args) {
		int[] a = new int[] { 7, 8, 6, 9, 2, 10 };

		heap(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void heap(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int c = i;
			do {
				int root = (c - 1) / 2;
				if (ar[root] < ar[c]) {
					int temp = ar[root];
					ar[root] = ar[c];
					ar[c] = temp;
				}
				c = root;
			} while (c != 0);

		}
		for (int i = ar.length - 1; i >= 0; i--) {
			int temp = ar[0];
			ar[0] = ar[i];
			ar[i] = temp;
			int root = 0;
			int c = 1;
			do {
				c = 2 * root + 1;
				if (c < i - 1 && ar[c] < ar[c + 1]) { //반대로 하면 오류
					c++;
				}
				if (c < i && ar[root] < ar[c]) {
					int temp1 = ar[root];
					ar[root] = ar[c];
					ar[c] = temp1;
				}
				root = c;
			} while (c < i);

		}

	}

}
