package com.codingTest.알고리즘2024.chap1.sector1;

import java.util.ArrayList;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }

        for(String x : solution(n, str)){
            System.out.println(x);
        }

    }

    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

}
