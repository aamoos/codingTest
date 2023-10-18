package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P17103_골드바흐파티션
 * author         : 김재성
 * date           : 2023-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-18        김재성       최초 생성
 */
public class P17103_골드바흐파티션 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        //소수 구하기 = 소수 false
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true; //0과 1은 소수가 아니므로 true
        for(int i=2; i*i <= 1000000; i++){
            if(!num[i]){
                for(int j= i+i; j<=1000000; j=j+i){
                    num[j] = true;
                }
            }
        }

        while(t-- > 0){
            int temp = Integer.parseInt(br.readLine());
            int ans = 0;
            for(int j=2; j<=temp/2; j++){
                if(!num[j] && !num[temp-j]){
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }
}
