package com.codingTest.harucoading.브론즈3.Day6;

import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            if(A==0 && B==0 && C==0){
                break;
            }
            boolean result = false;
            if(B<A && C<A){
                if(A*A == B*B + C*C){
                    result = true;
                }
            }else if(A<B && C<B){
                if(B*B == A*A + C*C){
                    result = true;
                }
            }else{
                if(C*C == B*B + A*A){
                    result = true;
                }
            }

            if(result){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}