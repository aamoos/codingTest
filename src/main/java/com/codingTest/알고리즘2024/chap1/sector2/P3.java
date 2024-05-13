package com.codingTest.알고리즘2024.chap1.sector2;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++){
            b[i] = scan.nextInt();
        }

        for(char x : solution(n, a, b).toCharArray()){
            System.out.println(x);
        }

    }

    public static String solution(int n, int[] a, int[] b){
        String answer = "";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]){
                answer+= "D";
            }else if(a[i] == 1 && b[i] == 3){
                answer+="A";
            }else if(a[i] == 2 && b[i] == 1){
                answer+="A";
            }else if(a[i] == 3 && b[i] == 2){
                answer+="A";
            }else{
                answer+="B";
            }
        }

        return answer;
    }
}
