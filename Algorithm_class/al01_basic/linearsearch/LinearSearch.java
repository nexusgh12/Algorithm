package Algorithm.Algorithm_class.al01_basic.linearsearch;

import java.util.Scanner;

//선형검색 linear search
//순차적으로 검색한다.
public class LinearSearch {

    static int LinearSearch1(int[] data, int n, int key){
        // 배열에서 key값을 검색하여 index값을 return한다.
        //만약 검색된 index가 없으면 -1을 리턴한다.
        //0, 1, 2, 3, ...
        for(int i = 0; i<n; i++){
            if(data[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int LinearSearch2(int[] data, int n, int key){
        int i = 0;
        while(true){
            // i index 위치가 존재하는가
            if(i==n){
                return -1;
            }
            //검색한 데이터를 찾은 경우
            if(data[i]==key){
                return i;
            }
            ++i;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //데이터의 개수 입력
        System.out.print("데이터수->");
        int n = sc.nextInt();

        //배열을 생성
        int data [] = new int[n];

        //데이터 입력
        for(int i=0; i<n; i++){
            System.out.print("data["+i+"]=");
            data[i] = sc.nextInt();
        }

        System.out.print("검색할 데이터->");
        int key = sc.nextInt();

        //for를 이용한 선형검색호출
        int idx = LinearSearch1(data, n, key);
        if (idx > 0) {
            System.out.println(key+"는 data ["+idx+"]에 있습니다.");
        } else {
            System.out.println(key+"는 존재하지 않는 데이터입니다.");
        }



        int idx2 = LinearSearch2(data, n, key);
        if (idx2 > 0) {
            System.out.println(key+"는 data ["+idx+"]에 있습니다.");
        } else {
            System.out.println(key+"는 존재하지 않는 데이터입니다.");
        }
    }
}
