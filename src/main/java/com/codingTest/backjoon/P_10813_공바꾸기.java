package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P_10813_공바꾸기
 * author         : 김재성
 * date           : 2023-07-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-20        김재성       최초 생성
 */

/**
입력
5 4
1 2
3 4
1 4
2 2
 */

/**
 출력
 3 1 4 2 5
 */


public class P_10813_공바꾸기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int arr[] = new int[N];
        int M = scan.nextInt();
        int temp;

        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;       //배열의 index는 0부터 시작 [0,1,2,3,4,5]
                                //첫번째는 0 이지만 첫번째 바구니 이기때문에 1부터 시작이니 +1
        }

        for(int j=0; j<M; j++){
            int I = scan.nextInt();
            int J = scan.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }

        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}