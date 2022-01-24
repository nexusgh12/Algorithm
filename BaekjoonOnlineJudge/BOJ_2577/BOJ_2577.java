package Algorithm.BaekjoonOnlineJudge.BOJ_2577;

import java.io.*;

class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result = A * B * C;
        String str = Integer.toString(result);
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); ++i) {
            System.out.println("str.charAt(i): " + str.charAt(i) + " ascii : "+ (int)str.charAt(i) + " - '0' ascii : " + (int)'0'+" = " + (str.charAt(i) - '0'));
            arr[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < arr.length; ++i) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
//
//class BOJ_2577 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int A = Integer.parseInt(br.readLine());
//        int B = Integer.parseInt(br.readLine());
//        int C = Integer.parseInt(br.readLine());
//        int result = A * B * C;
//        int[] arr = new int[10];
//        while (result > 0) {
//            arr[(result%10)]++;
//            result /= 10;
//        }
//        for (int i = 0; i < arr.length; ++i) {
//            bw.write(arr[i]+"\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }


//}