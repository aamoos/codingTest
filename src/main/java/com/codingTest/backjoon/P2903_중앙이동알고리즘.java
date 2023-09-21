package com.codingTest.backjoon;

import java.util.Scanner;

public class P2903_중앙이동알고리즘 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println((int) Math.pow(Math.pow(2, n) +1, 2));
    }
}