package com.codingTest.backjoon;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P1541_잃어버린괄호
 * author         : 김재성
 * date           : 2023-07-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-19        김재성       최초 생성
 */
public class P1541_잃어버린괄호 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String example = scan.nextLine();
        String[] str = example.split("-");
        for(int i=0; i<str.length; i++){
            int temp = mySum(str[i]);

            if(i == 0){
                answer = answer + temp;
            }else{
                answer = answer - temp;
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String a) {
        int sum = 0;
        String[] temp = a.split("[+]");
        for(int i=0; i<temp.length; i++){
            sum = sum + Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
