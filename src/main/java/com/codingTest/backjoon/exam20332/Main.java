package com.codingTest.backjoon.exam20332;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(solution());
    }

    public static String solution(){
        String answer = "";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;

        for(int i=0; i<n; i++){
            sum+=scan.nextLong();
        }

        boolean isPossible = true;

        if(sum % 3 != 0){
            isPossible = false;
        }

        if(isPossible){
            answer = "yes";
        }else{
            answer = "no";
        }
        return answer;
    }
}