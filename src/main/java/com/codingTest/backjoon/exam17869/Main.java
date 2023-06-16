package com.codingTest.backjoon.exam17869;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        System.out.println(solution(a));
    }

    public static int solution(long a){
        int answer = 0;
        while(true){
            if(a%2 != 0){
                a=a+1;
            }else{
                a=a/2;
            }

            answer++;

            if(a==1){
                break;
            }
        }
        return answer;
    }
}
