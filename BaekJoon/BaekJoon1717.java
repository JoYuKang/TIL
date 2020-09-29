package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

import java.util.StringTokenizer;

public class BaekJoon1717 {
	//������ ǥ��
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int arr[] = new int[num + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int sum = Integer.parseInt(st.nextToken());
			int str = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			if (sum == 0) {
				unionParent(arr, str, end);
			} else {
					System.out.println(findParent(arr, str, end));
			}
		}
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
			return "YES";
		} else {
			return "NO";
		}

	}

}
