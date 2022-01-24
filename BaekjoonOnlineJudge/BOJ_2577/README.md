 # <img src="https://d2gd6pc034wcta.cloudfront.net/tier/4.svg" width="25" height="25"> [BOJ #2577]  숫자의 개수 - Java 
#### :link: [소스 코드](https://github.com/nexusgh12/Algorithm/tree/main/BaekjoonOnlineJudge/BOJ_2577/BOJ_2577.java)  
#### :link: [문제 풀러 가기](https://www.acmicpc.net/problem/2577)

***
### :seedling: 문제
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에  
0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.  

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,  
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

### :seedling: 문제 분류
- 수학
- 구현
- 사칙연산
***
### :seedling: 입력
- 첫째 줄 : A
- 둘째 줄 : B
- 셋째 줄 : C
- A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

### :seedling: 출력
첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.  
마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에  
1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

***

### :seedling: 예제 입력1
```
150
266
427
```

### :seedling: 예제 출력1
```
3
1
0
2
0
0
0
2
0
0
```


*** 

### :seedling: 문제 풀이

### 💡 식 
```

  1. bufferedReader를 이용하여 입력값을 받고, 각 변수에 정수형으로 데이터를 초기화 한다.
  2. result에 각 변수의 곱을 초기화하고, Integer.toString()함수를 이용하여 문자열로 캐스팅한다.
  3. 0~9까지의 빈도 체크를 할 배열을 생성한다.
```

**- 아스키코드를 이용한 문제 풀이**
```
 각 배열의 인덱스는 해당 숫자를 의미한다.  
 result의 각 자리수의 아스키코드 - '0'의 아스키코드 를 하게되면  
 반복문을 통해 각 자리수의 숫자를 확인 할 수 있다.   
     
    ex) arr['7' - '0']  
        arr[55 - 48]  
        arr[7]++  
    
    숫자 0의 아스키코드 : 48  
    예시 숫자 7의 아스키코드 :55  
```
<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3bdb713b-69c7-40ba-9175-2a4e9478280b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220124%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220124T112324Z&X-Amz-Expires=86400&X-Amz-Signature=93440f1f06daf55ee0eadb4e344ab2b2e91b311214e0beee4542f2b49a1f7f9c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject">



**- 몫과 나머지를 이용한 문제풀이**
```
결과 값을 10으로 나눈 나머지를 가지고 각 자리의 숫자를 체크한다.
이후 10으로 나눠서 다음 자리수로 이동시킨다.
     
     ex) result : 17037300
         result를 10으로나눈 나머지
         
         17037300%10 : 0
         17037300/10 : 1703730
         
         1703730%10 : 0
         1703730/10 : 170373
         
         170373%10 : 3
         170373/10 : 17037...반복
         
         
         
```

#### 🖼 아스키코드표
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile5.uf.tistory.com%2Fimage%2F216CE84C52694FF02054D4">


### :seedling: 코드



#### 💡아스키코드를 이용한 풀이
```java

import java.io.*;

class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result = A * B * C;
        String str = Integer.toString(result);
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); ++i) {
            arr[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < arr.length; ++i) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
```



#### 💡 몫과 나머지를 이용한 풀이
```java
class BOJ_2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result = A * B * C;
        int[] arr = new int[10];
        while (result > 0) {
            arr[(result%10)]++;
            result /= 10;
        }
        for (int i = 0; i < arr.length; ++i) {
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }


}
```