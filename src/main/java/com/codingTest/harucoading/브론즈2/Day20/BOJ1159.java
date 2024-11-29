package com.codingTest.harucoading.브론즈2.Day20;

import java.util.Scanner;

public class BOJ1159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A[] = new int[130];

        scan.nextLine();
        for(int i=0; i<N; i++){
            char index = scan.nextLine().toCharArray()[0];
            A[(int)index]++;
        }

        boolean check = false;
        for(int i=0; i<130; i++){
            if(A[i] > 4){
                check = true;
                System.out.print((char) i);
            }
        }

        if(!check){
            System.out.println("PREDAJA");
        }
    }
}
