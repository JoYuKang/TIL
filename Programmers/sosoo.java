package Pro;

import java.util.*;

public class sosoo {

    static List<String> list = new LinkedList<>();
    static HashSet<Integer> hs = new HashSet<>();

    public static void main(String[] args) {
        String numbers = "011";
        System.out.println(solution(numbers));
    }

    public static int solution(String numbers) {
        int answer = 0;
        char[] ch = new char[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            ch[i] = numbers.charAt(i);
        }
        for (int i = 0; i <= numbers.length(); i++) {
            permutation(ch, 0, i);
        }
        list.remove("");
        list.remove("0");
        //System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            hs.add(Integer.parseInt(list.get(i)));
        }
        Iterator<Integer> it = hs.iterator();
        int[] as = new int[hs.size()];
        int k = 0;
        while (it.hasNext()) {
            as[k++] = it.next();
        }

        for (int i = 0; i < as.length; i++) {
            int count = 0;
            for(int j= 1;j<=as[i];j++){
                if(as[i]%j==0){
                    count++;
                }
            }if(count==2){
                answer++;

            }
        }

        return answer;
    }

    static void permutation(char[] chars, int depth, int r) {
        StringBuilder sb = new StringBuilder();

        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(chars[i]);
            }
            list.add(sb.toString());
            sb.delete(0, sb.length());
            return;
        }

        for (int i = depth; i < chars.length; i++) {
            char tmp = chars[depth];
            chars[depth] = chars[i];
            chars[i] = tmp;

            permutation(chars, depth + 1, r);

            //스왑한거 다시 되돌리기
            chars[i] = chars[depth];
            chars[depth] = tmp;
        }
    }
}
