package com.codingTest.inflearn.exam0208;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}

		for(int x : solution(n, arr)){
			System.out.print(x+" ");
		}
	}

	public static int[] solution(int n, int[] arr){
		int[] answer = new int[n];

		for(int i=0; i<n; i++){
			int cnt=1;
			for(int j=0; j<n; j++){
				if(arr[j] > arr[i]) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}
		return answer;
	}

}
