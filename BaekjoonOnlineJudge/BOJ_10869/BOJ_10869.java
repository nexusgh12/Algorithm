package Algorithm.BaekjoonOnlineJudge.BOJ_10869;

import java.io.*;
import java.util.StringTokenizer;

class BOJ_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        bw.write((a+b) + "\n");
        bw.write((a-b) + "\n");
        bw.write((a*b) + "\n");
        bw.write((a/b) + "\n");
        bw.write((a%b) + "\n");

        bw.flush();
        bw.close();
        br.close();

    }
}
