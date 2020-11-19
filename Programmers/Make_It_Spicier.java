package tomorrow;

import java.util.PriorityQueue;

public class Make_It_Spicier {
	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };

		int K = 7;

		System.out.println(solution(scoville, K));

	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		// �ִ� ���� �켱������ ť = �ִ� ��, �ּ� ���� �켱������ ť = �ּ� ��

		// �ڵ�������������
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			minHeap.add(scoville[i]);
		}

		while (minHeap.peek() < K) {
			// ���ϳ�����, ���ϳ�����+1 ����
			int min1 = minHeap.poll();
			int min2 = minHeap.poll();

			// ���� �ֱ�
			minHeap.add(min1 + min2 * 2);
			answer++;

			// ���� ���� ���� K�̻��̸� ��
			if (minHeap.peek() >= K) {
				break;
			}

			// ������ ���� K���� ���� ��
			if (minHeap.peek() < K && minHeap.size() == 1) {
				answer = -1;
				break;
			}
		}

		return answer;
	}
}