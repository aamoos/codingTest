package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char c = st.nextToken().charAt(0);

        int[] answer = new int[str.length()];
        int p = 1000;

        //왼쪽으로부터 떨어진거리 출력
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        //오른쪽으롷부터 떨어진거리 출력
        p = 1000;
        for(int i= str.length()-1; i>=0; i--){
            if(str.charAt(i) == c){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        for (int i : answer) {
            System.out.print(i+" ");
        }
    }
}
