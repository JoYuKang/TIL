package todaytest;

public class Pro_NQueen {
    static int[] arr;
    static int answer;

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    static public int solution(int n) {
        answer = 0;
        for (int i = 0; i < n; i++) {
            arr = new int[n];
            arr[0] = i;
            backtracking(n, 1); // n =4 row = 1
        }

        return answer;
    }

    public static void backtracking(int max, int row) {// max =4 row = 1
        if (row == max) {
            answer++;
            arr[row - 1] = 0;
            return;
        }

        for (int i = 0; i < max; ++i) {
            arr[row] = i;
            if (isPossible(row)) {
                backtracking(max, row + 1);
            } else {
                arr[row] = 0;
            }
        }
        arr[row] = 0;
    }

    public static boolean isPossible(int row) {
        for (int i = 0; i < row; ++i) {
            if (arr[i] == arr[row]) {
                return false;
            }
            if (Math.abs(row - i) == Math.abs(arr[row] - arr[i])) { // arr[6] - arr[3] =  4 - 1 =  6 - 3 절대치가 같음
                return false;                                       // arr[6] - arr[2] = 4 - 8  = 2 - 6
            }
        }

        return true;
    }
}
