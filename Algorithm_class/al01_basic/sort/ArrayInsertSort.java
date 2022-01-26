package Algorithm.Algorithm_class.al01_basic.sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayInsertSort {
    // 삽입정렬 (Insert Sort)
    static void mySort(int a[], int n){
        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j;
            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }


    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        System.out.println("정렬 전-> " + Arrays.toString(a));
        mySort(a,a.length);
        System.out.println("정렬 후->" + Arrays.toString(a));
    }
}
