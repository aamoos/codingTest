package com.codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P_9063_대지
 * author         : 김재성
 * date           : 2023-09-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-19        김재성       최초 생성
 */
public class P_9063_대지 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] xArr = new int[n];
        int[] yArr = new int[n];

        for(int i=0; i<n; i++){
            xArr[i] = scan.nextInt();
            yArr[i] = scan.nextInt();
        }
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        System.out.print( (xArr[xArr.length-1] - xArr[0]) * (yArr[yArr.length-1] - yArr[0]) );
    }
}
