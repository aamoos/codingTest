package com.codingTest.harucoading.브론즈4.Day18;

import java.util.Scanner;

public class BOJ20499 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] kda = scan.nextLine().split("/");
        int k = Integer.parseInt(kda[0]);
        int d = Integer.parseInt(kda[1]);
        int a = Integer.parseInt(kda[2]);

        if(k+a<d || d==0){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }
    }
}