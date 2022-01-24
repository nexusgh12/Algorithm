package Algorithm.Algorithm_class.al01_basic.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int arr[], int n, int key) {
        //왼쪽 시작 인덱스
        int left = 0;
        int right = n-1;
        do{
            int center = (left + right)/2;
            if(key==arr[center]){
                return center;
            } else if (arr[center] < key) {
                left = center + 1;
            }else{
                right = center-1;
            }
        }while(left<=right);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("데이터 수");

         int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"]=");
            arr[i] = sc.nextInt();
        }
        //검색할 숫자 입력력
        int key = sc.nextInt();

        int result = binarySearch(arr, n, key);
        if(result>=0){
            System.out.println(key +"는 arr["+result+"] 위치에 존재합니다.");
        }else{
            System.out.println(key+"는 존재하지 않는 데이터입니다.");
        }
    }}
