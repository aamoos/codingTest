package com.codingTest.알고리즘복습.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a>=90 && a<=100){
            System.out.print("A");
        }else if(a>=80 && a<=89){
            System.out.print("B");
        }else if(a>=70 && a<=79){
            System.out.print("C");
        }else if(a>=60 && a<=69){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}