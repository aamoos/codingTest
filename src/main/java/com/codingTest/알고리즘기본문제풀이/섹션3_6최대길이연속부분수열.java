package com.codingTest.알고리즘기본문제풀이;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.알고리즘기본문제풀이
 * fileName       : 섹션3_6최대길이연속부분수열
 * author         : 김재성
 * date           : 2023-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-16        김재성       최초 생성
 */
public class 섹션3_6최대길이연속부분수열 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }

    public static int solution(int n, int k, int[] arr){
        int answer = 0, cnt=0, lt=0;

        for(int rt=0; rt<n; rt++){
            if(arr[rt] == 0){
                cnt++;
            }

            while(cnt>k){
                if(arr[lt] == 0){
                    cnt --;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }
}
