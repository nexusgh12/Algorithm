package Algorithm.BaekjoonOnlineJudge.BOJ_18405;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_18405{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int x=s.nextInt();

        int[] distance = new int[m];
        ArrayList<ArrayList<Integer>>linkLst = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++){
            linkLst.add(new ArrayList<Integer>());
            distance[i]=-1;
        }
        distance[x]=0;

        for(int i=0; i<m; i++){
            int a=s.nextInt();
            int b=s.nextInt();

            linkLst.get(a).add(b);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(x);

        while(!queue.isEmpty()){
            int tmp = queue.poll();

            for(int i=0; i<linkLst.get(tmp).size();i++){
                int next = linkLst.get(tmp).get(i);

                if(distance[next]==-1){
                    distance[next]=distance[tmp]+1;
                    queue.add(next);
                }
            }
        }

        boolean chk = false;
        for(int i=0;i<=n;i++){
            if(distance[i]==k){
                System.out.println(i);
                chk=true;
            }
        }
        if(!chk)  System.out.println(-1);
    }
}