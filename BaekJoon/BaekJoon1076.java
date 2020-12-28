package todaytest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] multiplies = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        long result = 0;
        for (int i = 0; i < 3; i++) {
            int index = java.util.Arrays.asList(colors).indexOf(br.readLine()); // 이 부분이 중요
            if(i != 2) {
                result = result * 10 * i + values[index];
            } else {
                if(index != 0)
                    result = result * multiplies[index];
            }
        }
        System.out.println(result);
    }
}
