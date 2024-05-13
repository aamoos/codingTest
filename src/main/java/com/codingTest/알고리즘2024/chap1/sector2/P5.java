package com.codingTest.알고리즘2024.chap1.sector2;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+1) ch[j]=1;
            }
        }

        return answer;
    }
}
