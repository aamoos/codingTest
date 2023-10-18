package com.codingTest.알고리즘.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : com.codingTest.알고리즘.step1
 * fileName       : P2
 * author         : 김재성
 * date           : 2023-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-18        김재성       최초 생성
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

//        for (char c : s.toCharArray()){
//            if(Character.isLowerCase(c)){
//                //소문자일경우
//                sb.append(Character.toUpperCase(c));
//            }else{
//                //대문자일경우
//                sb.append(Character.toLowerCase(c));
//            }
//        }

        //ascii
        //c>=65 && c<=90 -> 대문자
        //c>=97 && c<=122 -> 소문자
        //대문자 -> 소문자 c+32
        //소문자 -> 대문자 c-32
        for (char c : s.toCharArray()) {
            if(c>=97 && c<=122){
                //소문자
                sb.append((char) (c-32));
            }else{
                //대문자
                sb.append((char) (c+32));
            }
        }

        System.out.println(sb.toString());
    }
}