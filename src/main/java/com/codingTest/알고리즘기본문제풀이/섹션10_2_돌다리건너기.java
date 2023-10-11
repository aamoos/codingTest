package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션10_2_돌다리건너기 {

    public static int[] dy;

    public static int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n+1; i++){
            dy[i] = dy[i-2]+dy[i-1];
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        dy = new int[n+2];
        System.out.println(solution(n));
    }
}
