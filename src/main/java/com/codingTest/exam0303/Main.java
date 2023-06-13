package com.codingTest.exam0303;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k  = scan.nextInt();
		int [] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, k, arr));

 	}

	public static int solution(int n, int k, int[] arr){
		int answer = 0, sum = 0;
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		answer = sum;
		for(int i=k; i<n; i++){
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		return answer;
	}
}
