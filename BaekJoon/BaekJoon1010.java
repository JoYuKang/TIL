package todaytest;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class BaekJoon1010 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(in.readLine()), i, j, k, n, m, d[][];
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(in.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            d = new int[n + 1][m + 1];
            for (i = 0; i <= m; i++) d[1][i] = i;
            for (i = 2; i <= n; i++)
                for (j = i; j <= m; j++)
                    for (k = j; k >= i; k--)
                        d[i][j] += d[i - 1][k - 1];
            out.write(String.valueOf(d[n][m]));
            out.newLine();
        }
        out.close();
        in.close();
    }
}
