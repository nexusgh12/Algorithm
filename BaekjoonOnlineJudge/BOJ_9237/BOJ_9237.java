package Algorithm.BaekjoonOnlineJudge.BOJ_9237;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int day = 0;
        ArrayList<Integer> t = new ArrayList<Integer>();
        st =new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            t.add(Integer.parseInt(st.nextToken()));
        }

        //묘목이 자라는데 걸리는 시간 내림차순 정렬
        Collections.sort(t, Collections.reverseOrder());

        // 묘목이 자라는 시간 + 묘목 심는데 덜리는 시간
        for (int i = 0; i < N; i++) {
            t.set(i, t.get(i) + i);
        }

        // 묘목이 자라는데 제일 오래걸리는 시간 + 묘목을 구입한 날과 이장님을 초대하는 날
        day = Collections.max(t) + 2;

        bw.write(day + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
