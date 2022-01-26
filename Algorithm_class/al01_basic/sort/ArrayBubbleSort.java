package Algorithm.Algorithm_class.al01_basic.sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {

    public static void swap(int a[], int idx1, int idx2 ) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //버블정렬 : 오름차순
    public static void mySort(int a[], int n) {//데이터 배열, 데이터 수

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j-1, j);
                }
            }
            System.out.println(i+"번 정렬" + Arrays.toString(a));
        }

    }

    public static void main(String[] args) {
        Random rand = new Random();
        //데이터 준비
        //1~100까지의 난수 생성하여 크기순으로 정렬
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); //0~99
        }
        System.out.println("정렬전: " + Arrays.toString(arr));

        mySort(arr, 10);

    }
}
