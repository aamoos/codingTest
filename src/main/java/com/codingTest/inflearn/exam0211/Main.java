package com.codingTest.inflearn.exam0211;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1; i<=n; i++){
			for(int j=1; j<=5; j++){
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(solution(n, arr));

	}

	public static int solution(int n, int[][] arr){
		int answer = 0, max = Integer.MIN_VALUE;

		for(int i=1; i<=n; i++){
			int cnt = 0;
			for(int j=1; j<=n; j++){
				for(int k=1; k<=5; k++){
					if(arr[i][k] == arr[j][k]){
						cnt++;
						break;
					}
				}
			}
			if(cnt>max){
				max=cnt;
				answer=i;
			}
		}
		return answer;
	}
}
