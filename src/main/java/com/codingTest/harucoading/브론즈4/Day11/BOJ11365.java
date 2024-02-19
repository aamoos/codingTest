package com.codingTest.harucoading.브론즈4.Day11;

import java.util.Scanner;

public class BOJ11365 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String text = scan.nextLine();
            if(text.equals("END")){
                break;
            }
            char[] textArr = text.toCharArray();
            int count = 0;
            for(int i=textArr.length-1; i>=0; i--){
                System.out.print(textArr[i]);
            }
            System.out.println();
        }
    }
}