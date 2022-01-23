package Algorithm.BaekjoonOnlineJudge.BOJ_2920;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        String output = "";
        for (int i = 0; i<8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                output = "ascending";
            } else if (arr[i + 1] == arr[i] - 1) {
                output = "descending";
            } else {
                output = "mixed";
                break;
            }
        }
        bw.write(output);
        bw.flush();
        bw.close();
        br.close();
    }
}
