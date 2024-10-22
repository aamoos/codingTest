package com.codingTest.harucoading.브론즈2.Day8;

import java.util.Scanner;

public class BOJ2920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean fix = true;

        if(n == 1){
            for(int i=2; i<9; i++){
                int temp = scan.nextInt();
                if(temp != i){
                    fix = false;
                    System.out.println("mixed");
                    break;
                }
            }

            if(fix){
                System.out.println("ascending");
            }

        }else if(n == 8){
            for(int i=7; i>0; i--){
                int temp = scan.nextInt();
                if(temp != i){
                    fix = false;
                    System.out.println("mixed");
                    break;
                }
            }

            if(fix){
                System.out.println("descending");
            }
        }else{
            System.out.println("mixed");
        }
    }
}
