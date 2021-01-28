package todaytest;

import java.awt.*;

import java.util.*;
import java.util.List;

public class BaekJoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        int j = 0;
        for (int i = 0; i < num; i++) {
            int len1 = str[i].length();
            for (j = i + 1; j < num; j++) {
                int len2 = str[j].length();
                if (len1 != len2) {
                    break;
                }
            }
            Arrays.sort(str, i, j);
            i = j - 1;
        }

        System.out.println(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals(str[i - 1])) {
                continue;
            }
            System.out.println(str[i]);
        }

    }
}
