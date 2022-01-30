package Algorithm.BaekjoonOnlineJudge.BOJ_2839;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int result = 0;

        while (N % 5 != 0) {
            N -=3;
            result++;
        }

        if (N < 0) {
            result = -1;
        } else {
            result+=N/5;
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
