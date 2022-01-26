package Algorithm.Algorithm_class.al01_basic.sort;

import java.util.Scanner;



public class QuickSortEx {
    public static void swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
    public static void myQuickSort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int pivot = a[(left + right) / 2];

        do {
            while (a[pl] < pivot) {
                pl++;
            }
            while (a[pr] > pivot) {
                pr--;
            }
            if(pl<=pr)
                swap(a, pl++, pr--);
        } while (pl<=pr);

        //정렬후 왼쪽을 재정렬할 재귀 호출
        if (left < pr) {
            myQuickSort(a, left, pr);
        }

        //정렬후 오른쪽 재정렬할 재귀호출
        if (pl < right) {
            myQuickSort(a, pl, right);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] score = new int[len];
        for (int i = 0; i < len; i++) {
            score[i] = sc.nextInt();
        }
        myQuickSort(score, 0, score.length-1);
        for (int i = 0; i < len; i++) {
            System.out.printf("%d등 : %d\n", (i+1), score[(len-1)-i]);
        }

    }
}

/*
국어 점수를 입력받아 점수순으로 출력하라.
퀵정렬을 이용해라
국어점수의 수 : 5
국어점수1 : 56
국어점수2 : 92
국어점수3 : 95
국어점수4 : 85
국어점수5 : 56

점수순으로 출력
1등 : 95
2등 : 92
...

 */