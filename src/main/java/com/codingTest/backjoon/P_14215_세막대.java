package com.codingTest.backjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P_14215_세막대
 * author         : 김재성
 * date           : 2023-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-20        김재성       최초 생성
 */
public class P_14215_세막대 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = scan.nextInt();
        }

        //배열정렬
        Arrays.sort(arr);

        //나머지 두변의 길이가 가장 긴 변의 길이보다 클경우 세변을 더한다.
        if(arr[0]+arr[1] > arr[2]){
            System.out.println(arr[0] + arr[1] + arr[2]);
        }else{
            System.out.println( (arr[0]+arr[1]) *2 - 1 );
        }
    }
}
