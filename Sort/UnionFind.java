package tomorrow;

import java.util.Scanner;

public class UnionFind {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int parent[] = new int[num+1];
		for (int i = 0; i < num; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < num; i++) {
			System.out.println(parent[i]);;
		}
//		for (int j = 0; j < 6; j++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			unionParent(parent, a, b);
//		}
		unionParent(parent, 0, 2);
		unionParent(parent, 1, 2);
		unionParent(parent, 2, 3);
		unionParent(parent, 4, 5);
		unionParent(parent, 4, 6);
		unionParent(parent, 5, 6);
		unionParent(parent, 4, 7);
		System.out.println("0�� 5�� " + findParent(parent, 0, 4));
	}

	// �θ� ��� ã��
	static int getParent(int parent[], int x) {
		if (parent[x] == x) {
			return x;
		}
		
		return getParent(parent, parent[x]);
	}

	// �� �θ� ��ġ�� �Լ�
	static void unionParent(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if (a < b) {
			parent[b] = a;
		} else {
			parent[a] = b;
		}
	}

	// ���� �θ� �������� Ȯ��
	static String findParent(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if (a == b) {
			return "�θ� ����.";
		} else {
			return "�θ� �ٸ���.";
		}

	}
}
