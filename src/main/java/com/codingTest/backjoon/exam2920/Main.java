package com.codingTest.backjoon.exam2920;

import java.io.IOException;
import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon.exam2920
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-26        김재성       최초 생성
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        int arr[] = new int[8];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]-1){
                answer = "ascending";
            }else if(arr[i] == arr[i+1]+1){
                answer = "descending";
            }else{
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}
