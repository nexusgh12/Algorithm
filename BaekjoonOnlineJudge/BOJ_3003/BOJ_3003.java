package Algorithm.BaekjoonOnlineJudge.BOJ_3003;

import java.io.*;
import java.util.StringTokenizer;

class BOJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ch = {1, 1, 2, 2, 2, 8};
        int len = st.countTokens();
        String s = "";

        for(int i = 0; i < len; i++){
            s += ch[i] -  Integer.parseInt(st.nextToken()) + " ";
        }
        bw.write(s);
        bw.flush();
        bw.close();
        br.close();
    }
}
