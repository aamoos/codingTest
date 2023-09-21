package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P9506_약수들의합
 * author         : 김재성
 * date           : 2023-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-03        김재성       최초 생성
 */
public class P9506_약수들의합 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            int n = scan.nextInt();
            if(n == -1){
                break;
            }

            int[] arr = new int[n];     //약수 담을 배열
            int sum = 0;
            int index = 0;
            for(int i=1; i<n; i++){
                //약수일때
                if(n%i == 0){
                    arr[index++] = i;
                    sum += i;
                }
            }

            if(sum != n){
                System.out.println(n + " is NOT perfect.");
                continue;
            }

            System.out.print(n + " = ");
            for(int i=0; i<index; i++){
                if(i == index-1){
                    System.out.print(arr[i]);
                }else{
                    System.out.print(arr[i] + " + ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
