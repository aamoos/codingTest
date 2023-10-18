package com.codingTest.프로그래머스;

/**
 * packageName    : com.codingTest.프로그래머스
 * fileName       : 배열을활용한solution
 * author         : 김재성
 * date           : 2023-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-18        김재성       최초 생성
 */
public class 배열을활용한solution {
    public static void main(String[] args) {

    }

    public static int solution(int[][] lines){
        int answer = 0;
        int[] arr = new int[200];

        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0] + 100; j < lines[i][1] + 100; j++){
                arr[j]++;
            }
        }

        for(int i=0; i<200; i++){
            if(arr[i] > 1){
                answer++;
            }
        }

        return answer;
    }

}
