package tomorrow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// Queue 사용법
		// add 		값 추가 
		// offer	가능하면 요소를 삽입해, 가능하지 않으면 false를 리턴
		// peek 	다음에 출력될 값을 확인
		// remove	remove() 메서드는 예외를 발생
		// poll 	헤드를 검색 및 제거하거나, 대기열이 비어 있으면 null을 반환
		//  큐가 비어있는 경우의 동작만이 다릅니다. 
		//메서드는 큐의 선두를 삭제 및 리턴
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
