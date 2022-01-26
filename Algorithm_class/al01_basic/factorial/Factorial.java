package Algorithm.Algorithm_class.al01_basic.factorial;

import java.util.Scanner;

public class Factorial {

    public static int factorial1(int max) {
        //5*4*3*2*1
        //����� ������ ����
        int result = 1;
        for (int i = max; i >= 1; i--) {
                result*=i;
        }
        return result;
    }
    static int result = 1;
    //���ȣ��� ���丮�� ���ϱ�
    public static void factorial2(int max) {
        if(max<=1)return;
        result *=max;
        factorial2(max-1);
    }

    public static int factorial3(int max) {
        if(max<=1) return 1;
        return max*factorial3(max-1);
    }

    public static int factorial4(int max) {
        int r = 1;
        while (true) {
            if(max<=1) return r;
            r *= max;
            max--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //�Է��� �� ���� ���丮�� ���ϱ�
        int max = sc.nextInt();

        //for���� �̿��� ���丮�� ���ϱ�
        int res1 = factorial1(max);
        System.out.println("f1->" + res1);

        result = 1;
        factorial2(max);
        System.out.println("f2->" + result);

        int r = factorial3(max);
        System.out.println("f3->"+r);

        System.out.println("f4->" + factorial1(max));
    }
}
