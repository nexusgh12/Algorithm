package Algorithm.BaekjoonOnlineJudge.BOJ_10974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10974_������ {
    //���� ���� ����
    static int N;
    static boolean[] visited;
    static int[] temp,arr;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N]; //�湮����
        temp = new int[N]; //N������ �ӽ� �迭
        arr = new int[N]; //����� �迭
        for (int i = 0; i < N; i++) {
            temp[i] = i+1;
        }

        permutation(0);
    }


    //for���� ���� 3���� ���� ����
    //3���� ������ �� ä������ ���ǹ��� ���� ���������� ����� ���ش�.
    private static void permutation(int depth) {
        
        //���̰� N�� ��������(3���� ������ �� ä������)
        if(depth == N) {
            //for���� �̿��Ͽ� ������ش�.
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        
        //for���� ���� 3���� ���� �������ش�.
        for (int i = 0; i < N; i++) {
            //�湮���� Ȯ��
            if(visited[i]) {
                continue;
            }
            
            //�湮���� ǥ��
            visited[i] = true;
            
            //����� �迭�� �ش� �� ����
            arr[depth] = temp[i];
            
            //��� �Լ� ȣ��
            permutation(depth+1);
            
            //����� ������ �湮 �ʱ�ȭ
            visited[i]=false;
        }
    }
}
