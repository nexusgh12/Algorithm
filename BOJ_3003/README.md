 # :bulb: [BOJ #3003  <img src="https://d2gd6pc034wcta.cloudfront.net/tier/1-a.svg" width="25" height="25"> ] 3003번 킹, 퀸, 룩, 비숍, 나이트, 폰 - Java 문제 풀이
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/blob/main/BOJ_3003/BOJ_3003.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/3003)

***
### :seedling: 문제 설명
<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/fd5130a0-6db9-46b6-810a-f264053ce1f6/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220115%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220115T101053Z&X-Amz-Expires=86400&X-Amz-Signature=a52d1dd53217876bc7342dc188bcb0eace360ab200f07c3f6fbbca56405be7e3&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject">

***

### :seedling: 문제 조건
    * 한줄에 공백을 구분자로 이용하여 값을 입력 받는다.
    * 주어진 순서대로 몇개의 피스를 더하거나 빼야하는지 출력한다.

    
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
 각 핀의 수를 배열에 넣고, 반복문을 통해 입력된 데이터를 빼주어 출력하는 방법으로 풀이했습니다.
 
    * 체스의 핀 수 : 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
    * 필요한 각 핀의 수 : 입력데이터 - 각 핀의 수
    
    
 #### :bulb: 코드
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ch = {1, 1, 2, 2, 2, 8};
        int len = st.countTokens();
        String s = "";

        for(int i = 0; i < len; i++){
            s += ch[i] -  Integer.parseInt(st.nextToken()) + " ";
        }
        bw.write(s);
        bw.flush();
        bw.close();
        br.close();
    }
}
```

    

  

