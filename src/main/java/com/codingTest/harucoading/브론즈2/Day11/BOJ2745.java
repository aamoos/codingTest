package com.codingTest.harucoading.브론즈2.Day11;

import java.util.Scanner;

public class BOJ2745 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] text = scan.next().toCharArray();
        int N = scan.nextInt();
        int A[] = new int[text.length];

        for(int i=0; i<text.length; i++){
            if(47 < text[i] && text[i] < 58){
                A[i] = Integer.parseInt(String.valueOf(text[i]));
            }else{
                A[i] = text[i] - 55;
            }
        }

        int result = A[A.length-1];
        int temp = N;
        for(int i=A.length-2; i>=0; i--){
            result += A[i] * temp;
            temp = temp * N;
        }

        System.out.println(result);

    }
}
