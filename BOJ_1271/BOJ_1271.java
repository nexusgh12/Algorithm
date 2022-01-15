package Algorithm;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

//속도 84ms
class BOJ_1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger money =new BigInteger(st.nextToken());
        BigInteger num =new BigInteger(st.nextToken());

        bw.write(money.divide(num)+"\n");
        bw.write(money.remainder(num)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

//속도 136ms
//class BOJ_1271 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BigInteger money = sc.nextBigInteger();
//        BigInteger num = sc.nextBigInteger();
//        System.out.println(money.divide(num));
//        System.out.println(money.remainder(num));
//    }
//}






