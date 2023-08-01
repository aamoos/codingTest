package com.codingTest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : com.codingTest.backjoon
 * fileName       : P25206_너의평점은
 * author         : 김재성
 * date           : 2023-08-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-01        김재성       최초 생성
 */
public class P25206_너의평점은 {
    public static double totalScore = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        double sum = 0;

        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            double b = Double.parseDouble(st.nextToken());
            String c = st.nextToken();
            //학점이 P인 항목은 계산에서 제외
            if(!"P".equals(c)){
                sum += calculate(b, c);
                totalScore+=b;
            }
        }
        System.out.println(String.format("%.6f", sum/totalScore));
    }

    public static double calculate(double b, String c){
        double score = 0;

        if("A+".equals(c)){
            score = 4.5;
        }else if("A0".equals(c)){
            score = 4.0;
        }else if("B+".equals(c)){
            score = 3.5;
        }else if("B0".equals(c)){
            score = 3.0;
        }else if("C+".equals(c)){
            score = 2.5;
        }else if("C0".equals(c)){
            score = 2.0;
        }else if("D+".equals(c)){
            score = 1.5;
        }else if("D0".equals(c)){
            score = 1.0;
        }else if("F".equals(c)){
            score = 0.0;
        }
        return b*score;
    }
}
