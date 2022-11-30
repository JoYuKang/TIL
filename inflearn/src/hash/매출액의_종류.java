package hash;

import java.util.*;

public class 매출액의_종류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        int lt = 0;
        for (int i = 0; i < K - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = K - 1; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }

    }
}
