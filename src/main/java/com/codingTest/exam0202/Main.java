package com.codingTest.exam0202;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0202
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-25        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[] arr){
        int answer = 1, max = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > max){
                answer++;
                max = arr[i];
            }
        }


        return answer;
    }
}
