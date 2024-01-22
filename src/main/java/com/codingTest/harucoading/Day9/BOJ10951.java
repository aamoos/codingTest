package com.codingTest.harucoading.Day9;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //다음에 받을게 있냐
        while(scan.hasNext()){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(A+B);
        }
    }
}