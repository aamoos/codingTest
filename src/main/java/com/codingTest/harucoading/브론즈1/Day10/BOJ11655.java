package com.codingTest.harucoading.브론즈1.Day10;

import java.util.Scanner;

public class BOJ11655 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] text = scan.nextLine().toCharArray();
        for(int i=0; i<text.length; i++){
            char now = text[i];

            if('a' <= now && now <= 'z'){
                //소문자이면

                now = (char) (now + 13);
                if(now > 'z'){
                    now = (char) (now%122+96);
                }
            }else if('A' <= now && now <= 'Z'){
                //대문자이면
                now = (char) (now + 13);
                if(now > 'Z'){
                    now = (char) (now%90+64);
                }
            }
            System.out.print(now);
        }
    }
}
