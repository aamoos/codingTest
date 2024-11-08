package com.codingTest.harucoading.브론즈2.Day14;

import java.util.Scanner;

public class BOJ1550 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] temp = scan.nextLine().toCharArray();
        int result = 0;

        for(int i=temp.length-1; i>=0; i--){
            char now = temp[i];
            int index = (int) Math.pow(16, temp.length-1-i);
            if(now >= 'A'){
                //문자열일때
                result += (now - 55) * index;
            }else{
                //아닐때
                result += (now - '0') * index;
            }
        }
        System.out.println(result);
    }
}
