package Algorithm.BaekjoonOnlineJudge.BOJ_17496;

import java.io.*;
import java.util.StringTokenizer;

class BOJ_17496 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int result = (N%T==0) ?  (N/T-1)*C*P : N/T*C*P;

        bw.write(result+ "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
