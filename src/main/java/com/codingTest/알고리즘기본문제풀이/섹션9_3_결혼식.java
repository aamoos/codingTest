package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 섹션9_3_결혼식 {

    public static class Time implements Comparable<Time>{
        public int time;
        public char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time ob) {

            if(this.time == ob.time){
                return this.state-ob.state;     //알파벳에서 정렬해라
            }else{
                return this.time-ob.time;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int sT = scan.nextInt();
            int eT = scan.nextInt();
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }
        System.out.println(solution(arr));
    }

    private static int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for(Time ob : arr){
            if(ob.state == 's'){
                cnt++;
            }else{
                cnt--;
            }
            answer=Math.max(answer, cnt);
        }

        return answer;
    }
}