package pro;

public class Main {
	public static void main(String[] args) {
		int[][] a = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = i * j;
			}

		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
