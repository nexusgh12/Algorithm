 # <img src="https://d2gd6pc034wcta.cloudfront.net/tier/9.svg" width="25" height="25">  [BOJ #1260] DFS와 BFS - Java 문제 풀이
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/tree/main/BaekjoonOnlineJudge/BOJ_1260/BOJ_1260.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/1260)

***
### :seedling: 문제 설명
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.<br>
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,<br>
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.<br>
***

### :seedling: 입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), <br>
탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. <br>
어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.<br>

### :seedling: 출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. <br>
V부터 방문된 점을 순서대로 출력하면 된다.<br>

### :seedling: 예제 입력
    예제 임력 1
    4 5 1
    1 2
    1 3
    1 4
    2 4
    3 4

    예제 입력 2
    5 5 3
    5 4
    5 2
    1 2
    3 4
    3 1

    예제 입력3
    1000 1 1000
    999 1000

### :seedling: 예제 출력
    예제 출력 1
    1 2 4 3
    1 2 3 4

    예제 출력 2
    3 1 2 5 4
    3 1 4 2 5

    예제 출력 3
    1000 999
    1000 999

***
### :seedling: 문제 풀이
 
 
    * dfs 
    1) 탐색하려는 노드가 탐색을 이미 한 노드인지 확인하고
    2) 탐색하려는 노드의 자식노드들을 확인한다.
    3) 자식노드가 없으면 탐색은 종료되고
    4) 자식노드가 있으면 자식노드를 같은 방식으로 탐색한다.

    * bfs
    큐(Queue)를 사용해서 문제를 해결
    

 #### :bulb: 코드
```java
package Algorithm.BaekjoonOnlineJudge.BOJ_1260;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
 public static int N;
 public static LinkedList<Integer>[] nodeList;

 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  StringTokenizer st = new StringTokenizer(br.readLine());

  N = Integer.parseInt(st.nextToken());
  int M = Integer.parseInt(st.nextToken());
  int V = Integer.parseInt(st.nextToken());

  //노드 리스트  객체생성
  nodeList = new LinkedList[N+1];

  //인접 리스트 생성
  for (int i = 0; i <= N; i++) {
   nodeList[i] = new LinkedList<Integer>();
  }

  for (int i = 0; i < M; i++) {
   //간선이 연결하는 두 정점의 번호 받아오기
   st = new StringTokenizer(br.readLine());

   //두 정점 초기화
   int node1 = Integer.parseInt(st.nextToken());
   int node2 = Integer.parseInt(st.nextToken());

   nodeList[node1].add(node2);
   nodeList[node2].add(node1);

   Collections.sort(nodeList[node1]);
   Collections.sort(nodeList[node2]);
  }



  //String builder 객체 생성(문자열 붙일때 사용)
  StringBuilder dfsResult = new StringBuilder();
  StringBuilder bfsResult = new StringBuilder();

  //노드 방문 여부 확인
  boolean[] dfsVisited = new boolean[N +1];
  boolean[] bfsVisited = new boolean[N +1];

  dfs(V, dfsVisited, dfsResult);
  bfs(V, bfsVisited, bfsResult);



  bw.write(dfsResult + "\n" + bfsResult);
  bw.flush();
  bw.close();
  br.close();

 }

 //깊이 우선 탐색(DFS)
 public static void dfs(int node, boolean[] visited, StringBuilder sb) {
  //방문 여부 검사
  if(visited[node]) return;

  //미방문 노드일 시 true
  visited[node] = true;

  // 방문한 노드 추가
  sb.append(node + " ");

  //인접 노드 재귀 호출
  for (int nextNode : nodeList[node]) {
   dfs(nextNode, visited, sb);
  }
 }


 public static void bfs(int node, boolean[] visited, StringBuilder sb) {
  //노드를 담을 큐 생성
  Queue<Integer> queue = new LinkedList<Integer>();

  //노드를 큐에 추가
  queue.offer(node);

  //큐에 있는 노드를 탐색
  while (!queue.isEmpty()) {
   //큐에서 노드 추출
   node = queue.poll();

   //해당 노드 방문 여부 검사
   if (visited[node]) continue;

   //노드 방문 설정
   visited[node] = true;

   //방문한 노드 출력 추가
   sb.append(node + " ");

   //인접 노드 큐에 추가
   for (int nextNode : nodeList[node]) {
    queue.add(nextNode);
   }
  }


 }

}

```

    

  

