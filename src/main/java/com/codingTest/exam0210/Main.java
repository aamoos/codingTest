package com.codingTest.exam0210;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.print(solution(n, arr));

	}

	public static int solution(int n, int[][] arr){
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};

		int answer = 0;

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				boolean flag = true;

				for(int k=0; k<4; k++){
					int nx=i+dx[k];
					int ny=j+dy[k];
					if(nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j] && nx>=0){
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		return answer;
	}
}
