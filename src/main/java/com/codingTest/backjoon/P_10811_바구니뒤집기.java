package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P_10811_바구니뒤집기
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
 3 4 1 2 5
 */

public class P_10811_바구니뒤집기 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();     //바구니 개수
        int m = scan.nextInt();     //바구니 역순 정렬 횟수

        int arr[] = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = i;
        }

        for(int k=0; k<m; k++){
            int i= scan.nextInt();
            int j= scan.nextInt();

            for(int h=i; h<=j; h++){
                int nn = j--;

                int temp = arr[h];
                arr[h] = arr[nn];
                arr[nn] = temp;
            }
        }

        for(int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
