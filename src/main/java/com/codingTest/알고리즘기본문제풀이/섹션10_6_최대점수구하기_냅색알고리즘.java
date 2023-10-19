package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

public class 섹션10_6_최대점수구하기_냅색알고리즘 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] dy = new int[m+1];
        for(int i=0; i<n; i++){
            int ps = scan.nextInt();
            int pt = scan.nextInt();
            for(int j=m; j>=pt; j--){
                dy[j] = Math.max(dy[j], dy[j-pt]+ps);
            }
        }
        System.out.println(dy[m]);
    }
}
