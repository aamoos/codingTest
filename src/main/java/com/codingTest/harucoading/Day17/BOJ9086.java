package com.codingTest.harucoading.Day17;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i=0; i<t; i++){
            String text = scan.nextLine();
            String answer =
                    text.substring(0,1)+
                            text.substring(text.length()-1);
            System.out.println(answer);;
        }
    }
}