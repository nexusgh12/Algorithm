package Algorithm.BaekjoonOnlineJudge.BOJ_1157;

import java.io.*;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            //대문자
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                arr[str.charAt(i)-'A']++;
            }

            //소문자
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                arr[str.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i+65);
            } else if(arr[i] == max){
                ch='?';
            }
        }
        bw.write(ch);
        bw.flush();
        bw.close();
        br.close();
    }
}
