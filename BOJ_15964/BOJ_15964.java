package Algorithm.BOJ_15964;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class BOJ_15964 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st = new StringTokenizer(br.readLine());
         long a = Long.parseLong(st.nextToken());
         long b = Long.parseLong(st.nextToken());

         bw.write((a+b)*(a-b) + "\n");

         bw.flush();
         br.close();
         bw.close();
     }
}

// Scanner 사용
//class BOJ_15964 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//       System.out.println((a+b)*(a-b));
//    }
//}