package Algorithm.BaekjoonOnlineJudge.BOJ_10869;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class BOJ_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        bw.write((a+b) + "\n");
        bw.write((a-b) + "\n");
        bw.write((a*b) + "\n");
        bw.write((a/b) + "\n");
        bw.write((a%b) + "\n");

        bw.flush();
        bw.close();
        br.close();

    }
}
//Scanner 속도 112
//Scanner는 공백도 하나의 구분자로 보기때문에 편리함
//class BOJ_10869 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
//    }
//}
