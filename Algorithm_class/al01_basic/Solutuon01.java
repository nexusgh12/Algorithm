package Algorithm.Algorithm_class.al01_basic;

import java.util.Scanner;
//구구단
public class Solutuon01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        for (int i = 2; i<=9; i++) {
            int r = dan*i;
            System.out.printf("%2d * %2d = %3d\n", dan, i, r);
        }
    }
}
