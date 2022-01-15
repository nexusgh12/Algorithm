 # <img src="https://d2gd6pc034wcta.cloudfront.net/tier/1-a.svg" width="25" height="25"> [BOJ #17496]  스타후르츠 - Java 
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/blob/main/BOJ_17496/BOJ_17496.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/17496)

***
### :seedling: 문제
진수는 회사 생활에 지쳐 회사를 그만두고 귀농을 하여 작물들을 키우며 생활하고 있습니다.  
진수는 작물 중에서도 '스타후르츠' 라는 작물을 제일 좋아합니다.  

스타후르츠 씨앗을 심으면 자라는데 T일이 걸립니다.  
i일에 스타후르츠 씨앗을 심으면 i+T일에 수확할 수 있고 수확한 날에도 같은 칸에 씨앗을 또 심을 수 있습니다.  

진수에게는 스타후르츠 씨앗을 심을 수 있는 빈 칸이 C개 있고 한 칸에 한 개의 스타후르츠를 심을 수 있습니다.  

오늘은 여름 1일이고 N일까지 여름이 지속됩니다.  
스타후르츠는 여름이 아닌 날에는 바로 시들어버리므로 N일이 지나면 더 이상 수확할 수 없습니다.  

진수는 스타후르츠 한 개를 판매하면 P원을 벌 수 있습니다.  

진수는 올해 여름 동안 얼마나 많은 돈을 벌 수 있을까요?  

진수는 하루에 일을 원하는 만큼 할 수 있고, 씨앗도 충분히 가지고 있다고 가정합니다.

### :seedling: 문제 분류
- 수학
- 사칙연산
***
### :seedling: 입력
- 첫 번째 줄에 여름의 일 수 N (2 ≤ N ≤ 90)  
- 스타후르츠가 자라는데 걸리는 일 수 T (1 ≤ T ≤ N-1)  
- 스타후르츠를 심을 수 있는 칸의 수 C (1 ≤ C ≤ 300)  
- 스타후르츠 개당 가격 정수 P (1 ≤ P ≤ 1,000)

### :seedling: 출력
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.


***

### :seedling: 예제 입력1
```
60 10 300 1000
```

### :seedling: 예제 출력1
```
1500000
```
1일에 스타후르츠를 2개 심으면 4일에 스타후르츠 2개를 수확할 수 있고  
4일에 스타후르츠를 2개 심으면 7일에 스타후르츠 2개를 수확하여 총 4개를 수확할 수 있습니다.   
개당 가격이 750원이므로 여름동안 4 * 750 = 3000원을 벌 수 있습니다.
*** 

### :seedling: 예제 입력2
```
60 10 300 1000
```

### :seedling: 예제 출력2
```
1500000
```
1, 11, 21, 31, 41 일에 스타후르츠 씨앗을 심으면 됩니다.  
51일에 심으면 61일에 수확이 가능한데 여름은 60일까지 이므로 61일에는 수확할 수 없습니다.  
따라서 총 5 * 300 = 1500개의 스타후르츠를 수확할 수 있습니다.
***




### :seedling: 문제 풀이
* 여름 일 수를 자라는 일 수 만큼 나누면 스타후르츠를 심는 갯수를 구할 수 있습니다. 
* 두번째 예시처럼 10일 간격으로 수확이 가능하고 총 여름이 60일이고 1일에 심는경우(60 / 10 = 10번 심을 수 있습니다.)   
* 1~11, 11~21, 21~31, 31~41, 41~51, 51~61 일 간격으로 심을 수 있습니다.
* 하지만 51~61일 같은 경우에는 수확이 불가능하므로 심는 횟수 1회를 빼주어야합니다.
* 따라서 나머지(N%T)가 0인 경우 몫(N/T)에서 1을 뺴줘야 합니다.
* 이후 몫과 심는 칸의 수, 스타후르츠 개당 가격을 곱해주면 됩니다.

### 💡 식 
```
전체 금액 = 몫 * 칸의 수 * 가격
몫 = (N%T==0) ?  (N/T-1)*C*P : N/T*C*P
```

### :seedling: 코드
```java
import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int temp = N/T;
        if(N%T == 0) temp -= 1;
        int result = temp * C * P;

        bw.write(result+ "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}

```
