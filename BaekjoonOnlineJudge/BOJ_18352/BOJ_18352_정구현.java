package Algorithm.BaekjoonOnlineJudge.BOJ_18352;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class BOJ_18352_정구현 {
    // (2 ≤ N ≤ 300,000, 1 ≤ M ≤ 1,000,000, 1 ≤ K ≤ 300,000, 1 ≤ X ≤ N)
    private static int N; // 도시의 개수
    private static int M; // 도로의 개수
    private static int K; // 거리 정보
    private static int X; // 출발 도시 번호
    private static int[] dists; // 출발도시인 X와의 최단경로
    private static ArrayList<Edge>[] edgeList; // 도시 인접리스트

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextInt();
        // 생성 초기화
        dists = new int[N + 1];
        edgeList = new ArrayList[N + 1];
        Arrays.fill(dists, Integer.MAX_VALUE);
        for (int i = 1; i <= N; i++) {
            edgeList[i] = new ArrayList<>();
        }
        // 경로 초기화
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            // A번 도시에서 B번 도시로 이동하는 단방향 도로가 존재
            edgeList[start].add(new Edge(end, 1));
        }
        // 출발도시
        dists[X] = 0;
        //다익스트라
        dijkstra();
        int answer = 0;
        for (int i = 1; i< dists.length; i++){
            int distance = dists[i];
            if (distance == K) {
                System.out.println(i);
                answer++;
            }
        }
        if (answer == 0)  System.out.println(-1);
    }

    private static void dijkstra() {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(X, 0));
        while (!queue.isEmpty()) {
            Edge edge = queue.poll();
            int vertex = edge.vertex;
            int cost = edge.cost;
            if (dists[vertex] < cost) {
                continue;
            }
            for (int i = 0; i < edgeList[vertex].size(); i++) { // 해당 도시와 연결되 있는 도시들 탐색
                int vertex2 = edgeList[vertex].get(i).vertex;
                int cost2 = edgeList[vertex].get(i).cost + cost;
                if (dists[vertex2] > cost2) { // 최단경로 세팅
                    dists[vertex2] = cost2;
                    queue.add(new Edge(vertex2, cost2));
                }
            }
        }
    }

    private static class Edge implements Comparable<Edge> {
        int vertex;
        int cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) { //오름차순
            return cost - o.cost;
        }
    }
}