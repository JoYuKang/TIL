package tomorrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BaekJoon11279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int num = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		// Collections.reverseOrder() 내림차순 정렬
		for (int i = 0; i < num; i++) {
			int e = Integer.parseInt(br.readLine());
			if (e == 0) {
				if (!q.isEmpty()) {
					sb.append(q.poll() + "\n");
				} else {
					sb.append(0 + "\n");
				}
			} else {
				q.add(e);
			}

		}
		System.out.println(sb);
	}
}
