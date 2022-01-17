 # <img src="https://d2gd6pc034wcta.cloudfront.net/tier/1-a.svg" width="25" height="25"> [BOJ #10869]  사칙연산 - Java 
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/tree/main/BaekjoonOnlineJudge/BOJ_10869/BOJ_10869.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/10869)

***
### :seedling: 문제
두 자연수 A와 B가 주어진다.  
이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.  

### :seedling: 문제 분류
- 수학
- 구현
- 사칙연산
***
### :seedling: 입력
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000) 

### :seedling: 출력
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.


***

### :seedling: 예제 입력1
```
7 3
```

### :seedling: 예제 출력1
```
10
4
21
2
1
```


***


### :seedling: 문제 풀이
    * 사칙연산 및 나머지 연산(+, -, *, /, %)을 수행하여 출력한다.

### :seedling: 코드
#### :bulb: BufferedReader 사용 코드
```java
import java.io.*;
import java.util.StringTokenizer;

class BOJ_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        bw.write((a+b) + "\n");
        bw.write((a-b) + "\n");
        bw.write((a*b) + "\n");
        bw.write((a/b) + "\n");
        bw.write((a%b) + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}
```

#### :bulb: Scanner 사용 코드
- Scanner는 공백도 하나의 구분자로 보기때문에 편리함
```java
    //Scanner 속도 112
    class BOJ_10869 {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
        }

```

