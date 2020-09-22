package test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

import test03.BaekJoon5639.Node;

public class BaekJoon11725 {

	// ����� �� ����
	static List<Integer>[] relation;
	// �湮 ����
	static boolean[] isVisited;
	// ��ȯ�� �θ�
	static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token;
		int N = Integer.parseInt(br.readLine());

		relation = new ArrayList[N + 1];
		for (int i = 1; i < relation.length; i++) {
			relation[i] = new ArrayList<>();
		}
		isVisited = new boolean[N + 1];
		parents = new int[N + 1];

		N--;
		while (N-- > 0) {
			token = new StringTokenizer(br.readLine(), " ");
			int num1 = Integer.parseInt(token.nextToken());
			int num2 = Integer.parseInt(token.nextToken());

			relation[num1].add(num2);
			relation[num2].add(num1);
		}
		DFS(1); // ��Ʈ��� 1���� ����

		for (int i = 2; i < parents.length; i++) {
			System.out.println(parents[i]);
		}

	}

	public static void DFS(int node) {
		isVisited[node] = true;
		for (int i = 0; i < relation[node].size(); i++) {
			int linked = relation[node].get(i); // node�� ������ ���
			if (!isVisited[linked]) { // ������ ��忡 ���� �������� �ʾҴٸ�
				parents[linked] = node;
				DFS(linked);
			}
		}
	}

}