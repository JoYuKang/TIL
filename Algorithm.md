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
#### 최대 공약수 와 최소 공배수
<pre><code>
  static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    </code></pre> 
    
#### 피보나치 수열점

	점화식 재귀함수 사용
	
<pre><code>
public int Fibonacci(int n) {
        // 재귀함수 활용
        if(n <= 1) 
            return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
</code></pre>      

동적프로그래밍기법 사용     
	<pre><code>
	public static int dynamicFibonacci(int n) {
        int last1, last2, result = 0;
        
        if(n <= 1)
            return 1;
        
        last1 = 1;
        last2 = 1;
        
        for(int i=1; i < n; i++) {
            result = last1 + last2;
            last1 = last2;
            last2 = result;
        }
        
        return result;
    }
	</code></pre> 
#### 동적 계획법(Dynamic Programming) 

     Overlapping Subproblem     
     Optimal Substructure
     
     
#### 퇴각검색(BackTracking)     
해를 찾아가는 도중, 지금의 경로가 해가 될 것 같지 않으면 그 경로를 더이상 가지 않고 되돌아갑니다.     
 반복문의 횟수까지 줄임 효율성 Good
	<pre><code>
	
        public static void dfs(int d) {
	
        //개수 같으면 출력
        if (M == d) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else { // 개수 다름
            for (int i = 1; i <= N; i++) {
                if (!visit[i]) {
                   // if (d == 0 || arr[d - 1] < i) { // 뒤에 값이 더 크면 출력 
                        //d == 0은 다 출력 (1,2 | 1,3 | 1,4)
                        //이전 arr[]원소가 현재 i보다 작을 때

                        visit[i] = true; //방문 처리
                        arr[d] = i; //원소 담기

                        dfs(d + 1); //재귀

                        //원상복구
                        visit[i] = false;
                 //   }
                }
            }
        }
    }
    </code></pre> 
        
