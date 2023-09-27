package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 섹션9_1_씨름선수 {

    public static class Body implements Comparable<Body>{
        public int h, w;

        public Body(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Body o) {
            return o.h-this.h;
        }
    }

    public static int solution(ArrayList<Body> arr, int n){
        int cnt = 0;
        Collections.sort(arr); //내림차순
        int max = Integer.MIN_VALUE;
        for(Body ob : arr){
            if(ob.w > max){
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = scan.nextInt();
            int w = scan.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(solution(arr, n));
    }
}
