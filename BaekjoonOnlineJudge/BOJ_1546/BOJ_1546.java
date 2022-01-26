package Algorithm.BaekjoonOnlineJudge.BOJ_1546;

import java.io.*;
import java.util.*;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        double arr[] = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        float result = 0;

        for(int i = 0; i<N; i++){
           arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i<N; i++){
            result += (arr[i]/arr[arr.length-1])*100;
        }
        result /= N;
        bw.write(result+"\n");
        bw.flush();
        br.close();
        



    }
}
