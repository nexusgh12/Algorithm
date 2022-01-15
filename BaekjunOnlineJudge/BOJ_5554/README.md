 # <img src="https://d2gd6pc034wcta.cloudfront.net/tier/1-a.svg" width="25" height="25">  [BOJ #5554]  심부름 가는 길 - Java 
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/blob/main/BOJ_5554/BOJ_5554.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/5554)

***
### :seedling: 문제
승균이는 매일 학교, PC방, 학원에 다닌다.  
반복되는 일상에 익숙해진 승균이는 이동시간을 단축해서 PC방에 더 오래 머물고 싶었다.  
그래서 스톱워치를 들고 이동할 때마다 기록을 잰 후 집에 가서 분석해보기로 했다.  
 
집에 도착한 승균이는 측정한 결과를 보는 데, 전부 초 단위로 기록되어있다!  
맨날 놀기만 해서 총 이동 시간이 몇 분 몇 초인지 계산을 못 하는 승균이를 도와주자.  
하루 동안 측정한 결과가 주어지면, 이날의 총 이동 시간이 몇 분 몇 초인지 출력하는 프로그램을 작성하시오.  

***
### :seedling: 입력
입력은 총 4줄이며, 한 줄에 하나씩 양의 정수가 적혀있다.  

- 첫 번째 줄에 집에서 학교까지의 이동 시간을 나타내는 초가 주어진다.  
- 두 번째 줄에 학교에서 PC방까지의 이동 시간을 나타내는 초가 주어진다.  
- 세 번째 줄에 PC방에서 학원까지의 이동 시간을 나타내는 초가 주어진다.   
- 마지막 줄에 학원에서 집까지의 이동 시간을 나타내는 초가 주어진다.  
집에 늦게 가면 혼나기 때문에, 총 이동시간은 항상 1 분 0 초 이상 59 분 59 초 이하이다.  

### :seedling: 출력
총 이동시간 x 분 y 초를 출력한다. 첫 번째 줄에 x를, 두 번째 줄에 y를 출력한다.  


***

### :seedling: 예제 입력1
```
31
34
7
151
```

### :seedling: 예제 출력1
```
3
43
```

***

### :seedling: 예제 입력2
```
316
430
643
1253
```

### :seedling: 예제 출력2
```
44
2
```


***


### :seedling: 문제 풀이
    * 시간을 모두 더하고 이를 분(60초)으로 나눠 몫과 나머지를 구하여 출력한다.

### :seedling: 코드
```java
import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 4;
        int sum = 0;
        StringTokenizer st = null;
        for (int i = 0; i < num; i++)
        {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken());
        }
        bw.write(sum/60 + "\n");
        bw.write(sum%60+ "\n");

        bw.flush();
        br.close();
        bw.close();

    }

}
```