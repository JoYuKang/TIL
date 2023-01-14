package dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 가장_높은_탑_쌓기 {
    static class Brick{
        int w;
        int h;
        int s;

        public Brick(int s, int h, int w) {
            this.h = h;
            this.s = s;
            this.w = w;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] dy = new int[num];
        ArrayList<Brick> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Brick(s, h, w));
        }
        Collections.sort(list, new Comparator<Brick>() {
            @Override
            public int compare(Brick o1, Brick o2) {
                return o2.s - o1.s;
            }
        });
        dy[0] = list.get(0).h;
        int answer = dy[0];

        for (int i = 1; i < list.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j).w > list.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + list.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        System.out.println(answer);


    }
}
