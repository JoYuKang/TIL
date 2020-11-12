# TIL
## Today I Learned 
  ### 1. JAVA
  
  
  #### DFS (깊이 우선 탐색 Depth First Search)     
  루트 노드나 임의의 노드에서 시작하여 끝까지 탐색한 후 다시 원점으로 돌아가 다른 루트로 탐색하는 방식     
  즉, 다음 노드로 넘어가기 전에 해당 노드의 분기에 대해 완전 탐색을 하는 방식     

  DFS는 자동 미로 생성 또는 미로 탐색에 주로 사용
  
  ##### 특징

  넓게(Breadth) 탐색하기 전에 깊게(Depth) 탐색함     
  모든 노드를 방문하고자 하는 경우에 사용     
  자기 자신을 호출하는 순환 알고리즘의 형태 (재귀호출)★     
  노드 방문 여부를 확인함.     
  
  #### BFS( 너비 우선 탐색 Breadth First Search)
  노드에서 시작 정점으로부터 가까운 정점 노드를 먼저 방문하고 멀리 떨어져 있는 노드를 나중에 탐색 하는 방식     
      
  두 노드 사이의 최단 경로 혹은 임의의 경로를 찾고 싶을 때 이 방법을 선택     
  
  ##### 특징
  BFS는 재귀적으로 동작X          
  그래프 탐색의 경우 어떤 노드를 방문했었는지 여부를 반드시 검사(무한루프)     
  BFS는 방문한 노드들을 차례로 저장한 후 꺼낼 수 있는 자료 구조인 큐(Queue)를 사용     
  선입선출(FIFO) 원칙으로 탐색          

  
  #### 문자열 비교     
  charAt(i)    
  i번째의 인수를 읽어 문자로 반환한다.
  
 #### indexOf(i)    
  특정 문자나 문자열을 0에서 끝까지 검색하여 처음 발견되는 인덱스의 위치를 반환하며
  만약 찾지 못했을 경우 "-1"을 반환한다.

####  Queue 사용법
   add 		값 추가 
	 offer	가능하면 요소를 삽입해, 가능하지 않으면 false를 리턴     
	 peek 	다음에 출력될 값을 확인     
	 remove	remove() 메서드는 예외를 발생     
	 poll 	헤드를 검색 및 제거하거나, 대기열이 비어 있으면 null을 반환     
	  큐가 비어있는 경우의 동작만이 다릅니다.      
	  메서드는 큐의 선두를 삭제 및 리턴     
    
####  PriorityQueue 사용법     
     PriorityQueue<Integer> q = new PriorityQueue<>();     
     오름차순 정렬     
     PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());     
		 Collections.reverseOrder() 사용시 내림차순 정렬     
  
  
  
  
  
  
  
  


