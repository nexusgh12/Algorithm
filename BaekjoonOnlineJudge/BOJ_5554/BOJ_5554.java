package Algorithm.BaekjoonOnlineJudge.BOJ_5554;

import java.io.*;
import java.util.StringTokenizer;

class BOJ_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 4;
        int sum = 0;
        StringTokenizer st = null;
        for (int i = 0; i < num; i++)
        {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken());
        }
        bw.write(sum/60 + "\n");
        bw.write(sum%60+ "\n");

        bw.flush();
        br.close();
        bw.close();

    }

}

