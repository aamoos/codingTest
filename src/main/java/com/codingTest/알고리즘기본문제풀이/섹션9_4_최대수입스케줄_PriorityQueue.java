package com.codingTest.알고리즘기본문제풀이;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.PriorityQueue;
        import java.util.Scanner;

public class 섹션9_4_최대수입스케줄_PriorityQueue {
    public static class Lecture implements Comparable<Lecture>{
        public int money;
        public int date;

        public Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }

        @Override
        public int compareTo(Lecture ob) {
            return ob.date-this.date;       //내림차순
        }
    }

    static int n, max= Integer.MIN_VALUE;

    public static int solution(ArrayList<Lecture> arr){
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;

        //날짜가 하루씩 작아짐
        for(int i=max; i>=1; i--){
            for( ; j<n; j++){
                if(arr.get(j).date < i){
                    break;
                }
                pQ.offer(arr.get(j).money);
            }

            if(!pQ.isEmpty()){
                answer+=pQ.poll();
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m = scan.nextInt();
            int d = scan.nextInt();
            arr.add(new Lecture(m, d));
            if(d > max){
                max = d;
            }
            System.out.println(solution(arr));
        }
    }
}
