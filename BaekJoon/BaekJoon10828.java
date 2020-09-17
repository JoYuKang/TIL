package tomorrow;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		
//		 push(Element item); // ������ �߰�
//		 pop(); // �ֱٿ� �߰���(Top) ������ ����
//		 peek(); // �ֱٿ� �߰���(Top) ������ ��ȸ
//		 empty(); // stack�� ���� ������� Ȯ��, ������� true, �ƴϸ� false
		
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
