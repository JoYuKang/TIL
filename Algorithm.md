# TIL
## Today I Learned Algorithm

### JAVA     
#### BFS 미로찾기

  //기본 값   
  <pre><code>
	static int arr[][]; //배열     
	static boolean visit[][]; // 방문여부    
	static int h, w; // 높이 너비    
  </code></pre>     
  
  //좌표 구하기 위한 class    
<pre><code>
static class Dot {
		int x;
		int y;

		public Dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
   </code></pre> 
  //너비 탐색    
  <pre><code>
  	static void bfs(int n, int m, int k) {
  		Queue<Dot> q = new LinkedList<Dot>();
  		q.add(new Dot(n, m));
  		visit[n][m] = true;
     // 방향키
  		int[] dx = { 1, -1, 0, 0 }; // 우, 하, 좌, 상
  		int[] dy = { 0, 0, 1, -1 };

		while (!q.isEmpty()) {

			Dot d = q.poll();
			for (int i = 0; i < 4; i++) {
				// 다음 방문할 좌표 nextX, nextY
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];

				// 배열 범위 안에서만 가능
				if (nextX >= 0 && nextY >= 0 && nextX < h && nextY < w) {
					//  아직 방문 안한 상태만 && 원하는 값 0, 1, 2 일치 여부
					if (!visit[nextX][nextY] && arr[nextX][nextY] == k) {
						// 방문 좌표에 값 넣기 
						q.add(new Dot(nextX, nextY));
						// 다음 좌표는 방문했음으로 표시
						visit[nextX][nextY] = true;
					}
				}
			}
		}
	}
    </code></pre> 
  //값 구하기
  <pre><code>
public static void main(String[] args) {
  for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (arr[i][j] == 0 && !visit[i][j]) {
					bfs(i, j, 0);
					answer[0]++;
				}
			}
		}
}
</code></pre>      
#### DFS

#### 소수 구하는 에라토스테네스의 체   
 <pre><code>
	static int[] arr = new int[1000001]; // 범위 설정
	
	arr[1] = 1; // 초기값 설정 
	//에라토스테네스의 체 구현
	
		for (int i = 2; i <= n; i++) {
			for (int j = 2; i * j <= n; j++) {
				arr[i * j] = 1;
			}
		}
	// 값 찾기
	for (int i = m; i <= n; i++) {
		if (arr[i] != 1) // 소수인 값 구하기
			System.out.println(i); // 
		}
</code></pre>  

#### 순열 (모든 경우의 수 구하기)
<pre><code>	
	//  경우의 수를 넣을 배열 ch, 시작할 위치 depth,뽑을 수의 개수 r
   static void permutation(char[] ch, int depth, int r) {
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
</code></pre> 
