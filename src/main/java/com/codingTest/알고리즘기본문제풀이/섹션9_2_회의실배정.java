package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 섹션9_2_회의실배정 {

    public static class Time implements Comparable<Time>{
        public int s, e;

        public Time(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Time o) {
            if(this.e == o.e){
                return this.s - o.s;
            }else{
                return this.e - o.e;
            }
        }
    }

    public static int solution(ArrayList<Time> arr, int n){
        int cnt = 0;
        Collections.sort(arr);  //compareTo 기준으로 정렬함
        int et = 0;
        for(Time ob : arr){
            if(ob.s >= et){
                cnt++;
                et = ob.e;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(solution(arr, n));
    }
}
