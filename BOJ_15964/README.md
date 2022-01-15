 # <img src="https://d2gd6pc034wcta.cloudfront.net/tier/1-a.svg" width="25" height="25"> [BOJ #15964]  이상한 기호 - Java 
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/blob/main/BOJ_15964/BOJ_15964.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/15964)

***
### :seedling: 문제
부산일과학고등학교의 효진이는 수학의 귀재이다.  
어떤 문제라도 보면 1분 내에 풀어버린다는 학교의 전설이 내려올 정도였는데,  
이런 킹ㅡ갓 효진에게도 고민이 생겼다. 대부분의 문제에서 반복되는 연산이 있었기 때문이다!  
이 연산은 너무 길어서 종이에 풀던 효진이는 너무 고통스러워서, 자신이 새로 연산자를 만들기로 했다.

연산자의 기호는 ＠으로, A＠B = (A+B)×(A-B)으로 정의내리기로 했다.  
하지만, 효진이는 막상 큰 숫자가 들어오자 계산하기 너무 귀찮아졌다.  
효진이를 도와 정수 A, B가 주어지면 A＠B를 계산하는 프로그램을 만들어주자!  

### :seedling: 문제 분류
- 수학
- 구현
- 사칙연산
***
### :seedling: 입력
첫째 줄에 A, B가 주어진다. (1 ≤ A, B ≤ 100,000)

### :seedling: 출력
첫째 줄에 A＠B의 결과를 출력한다.

### :seedling: 서브태스크 1 (30점)
A, B ≤ 1,000

### :seedling: 서브태스크 2 (70점)
문제에서 주어진 제약 조건 외 제한 없음

***

### :seedling: 예제 입력1
```
4 3
```

### :seedling: 예제 출력1
```
7
```


### :seedling: 예제 입력2
```
3 4
```

### :seedling: 예제 출력2
```
-7
```
***


### :seedling: 문제 풀이
    * 주어진 데이터를 이용하여 (A+B)×(A-B) 연산을 출력한다.
    * int의 범위보다 큰 수가 입력 될 수 도 있으므로 자료형은 long으로 선언한다.

### :seedling: 코드

#### :bulb: BufferedReader/Writer 사용
```java
import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        bw.write((a+b)*(a-b) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
```

#### :bulb: Scanner 사용

```
class BOJ_15964 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
       System.out.println((a+b)*(a-b));
    }
}
```
