package Algorithm.BaekjoonOnlineJudge.BOJ_2739;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()) ;
        for(int i = 1; i<10; i++){
            bw.write(String.format("%d * %d = %d\n", N, i, N*i));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
