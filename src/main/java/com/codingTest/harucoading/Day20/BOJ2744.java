package com.codingTest.harucoading.Day20;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //대문자 + 32 -> 소문자
        //소문자 - 32 -> 대문자
        char[] text = scan.nextLine().toCharArray();

        for(int i=0; i<text.length; i++){
            char temp = text[i];

            if(temp >= 'a' && temp <= 'z'){
                //소문자일때
                System.out.print((char) (temp-32));
            }else{
                //대문자일때
                System.out.print((char) (temp+32));
            }
        }

    }
}