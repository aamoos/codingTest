package com.codingTest.harucoading.브론즈4.Day6;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
        //System.out.println((int) 'a');
        Scanner scan = new Scanner(System.in);
        int [] result = new int[26];
        char[] temp = scan.next().toCharArray();

        for(int i=0; i<temp.length; i++){
            result[temp[i]-97]++;
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}