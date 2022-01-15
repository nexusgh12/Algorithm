 # :bulb: [BOJ #3003] 3003번 킹, 퀸, 룩, 비숍, 나이트, 폰 - Java 문제 풀이
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/blob/main/BOJ_3003/BOJ_3003.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/3003)

***
### :seedling: 문제 설명
<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/fd5130a0-6db9-46b6-810a-f264053ce1f6/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220115%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220115T101053Z&X-Amz-Expires=86400&X-Amz-Signature=a52d1dd53217876bc7342dc188bcb0eace360ab200f07c3f6fbbca56405be7e3&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject">

***

### :seedling: 문제 조건
    * 
    * 
    * 
    
### :seedling: 입력
    예제 임력 1
    0 1 2 2 2 7

    예제 입력 2
    2 1 2 1 2 1
    
### :seedling: 출력
    예제 출력 1
    1 0 0 0 0 1

    예제 출력 2
    -1 0 0 1 0 7


***
### :seedling: 문제 풀이
 입력받은 돈(m)과 생명체의 수(n)의 몫과 나머지를 구하는 문제이다.  
 다음과 같이 구할 수 있다.  
 
    * 몫 = m/n
    * 나머지 = m%n
    
    
 BufferedReader / BufferedWriter와 Scanner를 이용한 두가지 방법이 있다.
 
 #### :bulb: BufferedReader와 BufferedWriter를 사용한 방법

 해당 방법은 Scanner를 사용한 방법보다 속도면에서 장점이 있습니다.  
 
    import java.io.*;
    import java.math.BigInteger;
    import java.util.StringTokenizer;
    
    class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger m =new BigInteger(st.nextToken());
        BigInteger n =new BigInteger(st.nextToken());

        bw.write(m.divide(n)+"\n");
        bw.write(m.remainder(n)+"\n");

        bw.flush();
        bw.close();
        br.close();
      }
    }
    
 #### :bulb: Scanner를 사용한 방법
      import java.util.Scanner;
      import java.math.BigInteger;
      
      class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          BigInteger money = sc.nextBigInteger();
          BigInteger num = sc.nextBigInteger();
          System.out.println(money.divide(num));
          System.out.println(money.remainder(num));
        }  
      }    
 
  

