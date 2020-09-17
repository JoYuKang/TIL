package tomorrow;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		
//		 push(Element item); // 데이터 추가
//		 pop(); // 최근에 추가된(Top) 데이터 삭제
//		 peek(); // 최근에 추가된(Top) 데이터 조회
//		 empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
		
		for(int i =0;i<num;i++) {	
			String st = sc.next();
			if(st.equals("push")) {
				int a = sc.nextInt();
				stack.push(a);
			}else if(st.equals("pop")) {
				try {
					System.out.println(stack.pop());
				} catch (Exception e) {
					System.out.println(-1);
				}
			}else if(st.equals("size")) {
				System.out.println(stack.size());
			}else if(st.equals("empty")) {
				System.out.println(stack.empty()? 1:0);
			}else if(st.equals("top")) {
				try {
					System.out.println(stack.peek());
				} catch (Exception e) {
					System.out.println(-1);
				}
				
			}
		}
		
	}
}
