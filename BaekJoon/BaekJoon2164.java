package tomorrow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// Queue ����
		// add 		�� �߰� 
		// offer	�����ϸ� ��Ҹ� ������, �������� ������ false�� ����
		// peek 	������ ��µ� ���� Ȯ��
		// remove	remove() �޼���� ���ܸ� �߻�
		// poll 	��带 �˻� �� �����ϰų�, ��⿭�� ��� ������ null�� ��ȯ
		//  ť�� ����ִ� ����� ���۸��� �ٸ��ϴ�. 
		//�޼���� ť�� ���θ� ���� �� ����
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= num; i++) {
			q.add(i);
		}
		for (int i = 0; i < num; i++) {
			if (q.size() == 1) {
				System.out.println(q.poll());
				break;
			}
			q.poll();
			q.add(q.poll());
		}

		
	}
}
