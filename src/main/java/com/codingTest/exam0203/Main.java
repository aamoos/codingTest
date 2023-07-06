package com.codingTest.exam0203;

import java.util.Scanner;

/**
 * packageName    : com.codingTest.exam0203
 * fileName       : Main
 * author         : 김재성
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        김재성       최초 생성
 */
public class Main {

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
                //비길경우
                answer+="D";
            }else if(a[i]==1 && b[i]==3){
                answer+="A";
            }else if(a[i]==2 && b[i]==1){
                answer+="A";
            }else if(a[i]==3 && b[i]==2){
                answer+="A";
            }else{
                answer+="B";
            }
        }
        return answer;
    }
}
