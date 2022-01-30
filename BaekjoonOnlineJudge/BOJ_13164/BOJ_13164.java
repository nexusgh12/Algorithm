package Algorithm.BaekjoonOnlineJudge.BOJ_13164;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class BOJ_13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<Integer>(N);
        ArrayList<Integer> diff = new ArrayList<Integer>(N-1);

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }


        for (int i = 0; i < N - 1; i++) {
            diff.add(i, arr.get(i + 1) - arr.get(i));
        }
        Collections.sort(diff);

        int result = 0;

        for (int i = 0; i < N - K; i++) {
            result += diff.get(i);
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
//public class BOJ_13164 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int [] arr = new int[N];
//        int[] diff = new int[N-1];
//
//        st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for (int i = 0; i < N - 1; i++) {
//            diff[i] = arr[i+1] - arr[i];
//        }
//        Arrays.sort(diff);
//
//        int result = 0;
//
//        for (int i = 0; i < N - K; i++) {
//            result += diff[i];
//        }
//
//        bw.write(result + "\n");
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}