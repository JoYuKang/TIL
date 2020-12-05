package BaekJoonTest;


import java.util.*;

public class BaekJoon10974 {
    static List<String> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        permutation(a,0,num);
        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    //  경우의 수를 넣을 배열 ch, 시작할 위치 depth,뽑을 수의 개수 r
    static void permutation(int[] chars, int depth, int r) {
        StringBuilder sb = new StringBuilder();

        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(chars[i]).append(" ");
            }
           // sb.append("\n");
            list.add(sb.toString());
            sb.delete(0, sb.length());
            return;
        }

        for (int i = depth; i < chars.length; i++) {
            int tmp = chars[depth];
            chars[depth] = chars[i];
            chars[i] = tmp;

            permutation(chars, depth + 1, r);

            //스왑한거 다시 되돌리기
            chars[i] = chars[depth];
            chars[depth] = tmp;
        }
    }
}
