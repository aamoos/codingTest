package com.codingTest.backjoon;

import java.util.Scanner;

public class P2745_진법변환 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int N = scan.nextInt();
        int tmp = 1;
        int ans = 0;

        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);

            if('A' <= c && c <= 'Z'){
                //90-65+10
                ans += (c - 'A' + 10) * tmp;
            }else{
                ans += (c - '0') * tmp;
            }
            tmp *= N;
        }
        System.out.println(ans);
    }
}
