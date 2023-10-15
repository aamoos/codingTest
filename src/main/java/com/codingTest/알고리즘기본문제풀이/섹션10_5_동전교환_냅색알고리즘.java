package com.codingTest.알고리즘기본문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class 섹션10_5_동전교환_냅색알고리즘 {
    static int n, m;
    static int[] dy;

    public static int solution(int[] coin){
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=coin[i]; j<=m; j++){
                dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        m = scan.nextInt();
        dy = new int[m+1];
        System.out.println(solution(arr));
    }
}
