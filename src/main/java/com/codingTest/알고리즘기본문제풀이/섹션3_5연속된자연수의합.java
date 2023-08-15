package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션3_5연속된자연수의합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0, cnt=1;
        n--;
        while(n > 0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0){
                answer++;
            }
        }
        return answer;
    }
}
