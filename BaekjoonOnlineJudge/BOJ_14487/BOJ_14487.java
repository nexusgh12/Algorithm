package Algorithm.BaekjoonOnlineJudge.BOJ_14487;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_14487 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int result = 0;
        ArrayList<Integer> t = new ArrayList<Integer>();
        st =new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(st.nextToken());
            t.add(i,  j);
            result += t.get(i);
        }

        result-= Collections.max(t);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
