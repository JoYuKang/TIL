package tomorrow;

public class Merge_Sort {
	static int[] tmp;
	static int[] a;

	public static void main(String[] args) {
		a = new int[] { 7, 8, 6, 9, 2, 10 };
		tmp = new int[a.length];
		mer(0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void mer(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mer(start, mid);
			mer(mid + 1, end);
			int p = start;
			int q = mid + 1;
			int idx = p;
			while (p <= mid || q <= end) {
				if (q > end || (p <= mid && a[p] < a[q])) {
					tmp[idx++] = a[p++];
				} else {
					tmp[idx++] = a[q++];
				}
			}
//			while (start <= mid || mid + 1 <= end) {
//				if (mid + 1 > end || (start <= mid && a[start] < a[mid + 1])) {
//					tmp[idx++] = a[start++];
//				} else {
//					tmp[idx++] = a[mid++ + 1];
//				}
//			}
			for (int i = start; i <= end; i++) {
				a[i] = tmp[i];
			}
		}
	}

}
