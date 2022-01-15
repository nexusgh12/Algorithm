package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ch = {1, 1, 2, 2, 2, 8};
        String s = "";
        for(int i = 0; i<=6; i++){
            int j = Integer.parseInt(st.nextToken());
            bw.write((ch[i] -j) + " ");
        }
        //bw.write("asd\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
