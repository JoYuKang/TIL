package todaytest;


public class Pro_단체사진 {
    static char[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static boolean[] visited = new boolean[8];
    static char[] position = new char[8];
    static int answer = 0;

    public static void main(String[] args) {
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};
        System.out.println(solution(n, data));
    }

    public static int solution(int n, String[] data) {
        //answer = 0;
        // visited = new boolean[8];
        //position = new char[8];

        backtracking(0, n, data);
        return answer;
    }

    static void backtracking(int idx, int n, String[] data) {
        if (idx == 8) {
            answer++;
        } else {
            for (int i = 0; i < 8; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    position[idx] = friends[i];
                    // 조건을 만족할 경우에만 실행
                    if (isPossible(idx + 1, n, data))
                        backtracking(idx + 1, n, data);
                    visited[i] = false;
                }
            }
        }
    }

    static boolean isPossible(int idx, int n, String[] data) {
        for (int i = 0; i < n; i++) {
            char[] condition = data[i].toCharArray();
            int from = -1, to = -1;
            for (int j = 0; j < idx; j++) {
                if (position[j] == condition[0]) from = j;
                if (position[j] == condition[2]) to = j;
            }
            if (from < 0 || to < 0)
                return true;
            // 프렌즈와의 간격
            int gap = Math.abs(from - to) - 1;
            int len = condition[4] - '0';
            switch (condition[3]) {
                case '=':
                    if (gap != len) return false;
                    break;
                case '>':
                    if (gap <= len) return false;
                    break;
                case '<':
                    if (gap >= len) return false;
                    break;
            }
        }
        return true;
    }
}
