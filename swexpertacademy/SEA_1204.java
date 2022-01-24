package Algorithm.swexpertacademy;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


class SEA_1204 {

    public static void main(String[] args) throws IOException {
//        //문제풀이
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int num = Integer.parseInt(br.readLine());
            int[] count = new int[101];
            int[] score = new int[1000];
            int maxScore = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 1000; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                count[score[j]]++;
            }
            for (int j = 0; j < count.length - 1; j++) {
                if (count[maxScore] <= count[j]) {
                    maxScore = j;
                }
            }
            bw.write("#" + num + " " + maxScore + "\n");

        }
        bw.flush();
        bw.close();
        br.close();


    }
}
//
//public class SEA_1204 {
//    public static void main(String[] args) throws IOException {
////        //문제풀이
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int T = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= T; i++) {
//            int num = Integer.parseInt(br.readLine());
//            int[] count = new int[101];
//            int[] score = new int[1000];
//            int maxScore = 0;
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j<1000;j++ ) {
//                score[j] = Integer.parseInt(st.nextToken());
//                count[score[j]]++;
//            }
//            for(int j = 0; j<count.length-1; j++){
//                if (count[maxScore] <= count[j]) {
//                    maxScore=j;
//                }
//            }
//            bw.write("#"+num+" "+maxScore+"\n");
//
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//
//
//
//
//
//    }
//}


//class Solution{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T;
//        T=sc.nextInt();
//
//        for(int test_case = 1; test_case <= T; test_case++)
//        {
//            int num = sc.nextInt();
//            int[] count = new int[101];
//            int[] score = new int[1000];
//            int maxScore = 0;
//            for (int j = 0; j<1000;j++ ) {
//                score[j] = sc.nextInt();
//                count[score[j]]++;
//            }
//            for(int j = 0; j<count.length-1; j++){
//                if (count[maxScore] <= count[j]) {
//                    maxScore=j;
//                }
//            }
//            System.out.println("#"+num+" "+maxScore);
//
//
//        }
//    }
//}