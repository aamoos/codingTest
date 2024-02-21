package com.codingTest.harucoading.브론즈4.Day16;

import java.util.Scanner;

public class BOJ17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();

        if(S+H+K >= 100){
            System.out.println("OK");
        }else if(S<H && S<K){
            System.out.println("Soongsil");
        }else if(H<S && H<K){
            System.out.println("Hanyang");
        }else{
            System.out.println("Korea");
        }
    }
}