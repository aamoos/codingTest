package com.codingTest.harucoading.브론즈3.Day19;

import java.util.Scanner;

//팰린드롬 -> 투포인트 알고리즘
public class BOJ10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] text = scan.nextLine().toCharArray();
        int start_index = 0;
        int end_index = text.length-1;
        boolean isF = true;
        while(start_index < end_index){
            if(text[start_index] != text[end_index]){
                isF = false;
                break;
            }
            start_index++;
            end_index--;
        }

        if(isF){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
