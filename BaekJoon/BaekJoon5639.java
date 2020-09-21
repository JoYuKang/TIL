package tomorrow;

import java.util.Scanner;

public class BaekJoon5639 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node node = null;
		int n = 0;
		while (true) {
			if (n == 0) {
				n = sc.nextInt();
				node = new Node(n);
			} else if (n != 0) {
				try {
					n = sc.nextInt();
					node = insert(node, n);
				} catch (Exception e) {
					// TODO: handle exception
					break;
				}
			}
		}
		postOrder(node);

	}

	public static class Node {
		Node left;
		Node right;
		int val;

		public Node(int v) {
			this.val = v;
		}
	}

	public static Node insert(Node num, int a) {
		Node current = null;
		if (num == null) {
			return new Node(a);
		}
		if (num.val > a) {
			current = insert(num.left, a);
			num.left = current;
		} else {
			current = insert(num.right, a);
			num.right = current;
		}
		return num;
	}

	public static void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.val);
		}
	}

}
