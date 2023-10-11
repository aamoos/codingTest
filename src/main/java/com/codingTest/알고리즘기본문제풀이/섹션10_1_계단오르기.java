package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션10_1_계단오르기 {

    public static int[] dy;

    public static int solution(int n){
        dy[1] = 1;
        dy[2] = 2;

        for(int i=3; i<=n; i++){
            dy[i] = dy[i-2]+dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        dy = new int[n+1];
        System.out.println(solution(n));
    }
}
