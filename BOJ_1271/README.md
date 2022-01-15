 # :bulb: [BOJ #1271] 1271번 엄청난 부자2 - Java 문제 풀이
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/blob/main/BOJ_1271/BOJ_1271.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/1271)

***
### :seedling: 문제 설명
<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a68fa698-2b9f-417e-ba41-39bebce9694c/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220115%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220115T110204Z&X-Amz-Expires=86400&X-Amz-Signature=0a4d6899baf437a211dcb21aba04a36191b93c4ad12c6cc2090394a8e0120124&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject">

***

### :seedling: 문제 조건
    * 한 줄로 입력을 받고, 공백으로 데이터 개수를 구분한다.
    * 첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. 
    * 첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다. 그리고 두 번째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.
    
### :seedling: 입력
    1000 100
    
### :seedling: 출력
    10
    0
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
 
  

