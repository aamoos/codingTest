package com.codingTest.harucoading.브론즈2.Day17;

import java.util.Scanner;

public class BOJ2902 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split("-");

        for(int i=0; i<text.length; i++){
            System.out.print(text[i].toCharArray()[0]);
        }
    }
}
