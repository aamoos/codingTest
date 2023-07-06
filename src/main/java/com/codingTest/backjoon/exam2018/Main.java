package com.codingTest.backjoon.exam2018;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam2018
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-07-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-03        김재성       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N){
            if(sum == N){
                count++;
                end_index++;
                sum = sum + end_index;
            }else if(sum > N){
                sum = sum - start_index;
                start_index++;
            }else{
                end_index++;
                sum = sum+end_index;
            }
        }
        System.out.println(count);
    }
}
