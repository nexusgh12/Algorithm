package Algorithm.Algorithm_class.al01_basic.sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {

    public static void swap(int a[], int idx1, int idx2 ) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //�������� : ��������
    public static void mySort(int a[], int n) {//������ �迭, ������ ��

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j-1, j);
                }
            }
            System.out.println(i+"�� ����" + Arrays.toString(a));
        }

    }

    public static void main(String[] args) {
        Random rand = new Random();
        //������ �غ�
        //1~100������ ���� �����Ͽ� ũ������� ����
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); //0~99
        }
        System.out.println("������: " + Arrays.toString(arr));

        mySort(arr, 10);

    }
}
