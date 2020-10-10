package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon10866 {
	//deck
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int temp = 0;
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if (str.equals("push_front")) {
				int tp = Integer.parseInt(st.nextToken());
				q.addFirst(tp);
			} else if (str.equals("push_back")) {
				temp = Integer.parseInt(st.nextToken());
				q.addLast(temp);
			} else if (str.equals("pop_back")) {
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.pollLast() + "\n");
				}
			} else if (str.equals("pop_front")) {
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.poll() + "\n");
				}
			} else if (str.equals("size")) {
				sb.append(q.size() + "\n");
			} else if (str.equals("empty")) {
				sb.append(q.isEmpty() ? 1 : 0);
				sb.append("\n");
			} else if (str.equals("front")) {
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.peek() + "\n");
				}
			} else if (str.equals("front")) {
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.peekFirst() + "\n");
				}
			} else if (str.equals("back")) {
				if (q.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.peekLast() + "\n");
				}
			}
		}
		System.out.println(sb);

	}

}
