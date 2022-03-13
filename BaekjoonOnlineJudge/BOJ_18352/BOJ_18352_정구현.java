package Algorithm.BaekjoonOnlineJudge.BOJ_18352;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class BOJ_18352_������ {
    // (2 �� N �� 300,000, 1 �� M �� 1,000,000, 1 �� K �� 300,000, 1 �� X �� N)
    private static int N; // ������ ����
    private static int M; // ������ ����
    private static int K; // �Ÿ� ����
    private static int X; // ��� ���� ��ȣ
    private static int[] dists; // ��ߵ����� X���� �ִܰ��
    private static ArrayList<Edge>[] edgeList; // ���� ��������Ʈ

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextInt();
        // ���� �ʱ�ȭ
        dists = new int[N + 1];
        edgeList = new ArrayList[N + 1];
        Arrays.fill(dists, Integer.MAX_VALUE);
        for (int i = 1; i <= N; i++) {
            edgeList[i] = new ArrayList<>();
        }
        // ��� �ʱ�ȭ
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            // A�� ���ÿ��� B�� ���÷� �̵��ϴ� �ܹ��� ���ΰ� ����
            edgeList[start].add(new Edge(end, 1));
        }
        // ��ߵ���
        dists[X] = 0;
        //���ͽ�Ʈ��
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
            for (int i = 0; i < edgeList[vertex].size(); i++) { // �ش� ���ÿ� ����� �ִ� ���õ� Ž��
                int vertex2 = edgeList[vertex].get(i).vertex;
                int cost2 = edgeList[vertex].get(i).cost + cost;
                if (dists[vertex2] > cost2) { // �ִܰ�� ����
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
        public int compareTo(Edge o) { //��������
            return cost - o.cost;
        }
    }
}