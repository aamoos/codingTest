package com.codingTest.exam0304;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		System.out.print(solution(n, m, arr));
 	}

	public static int solution(int n, int m, int[] arr){
		int answer = 0, sum=0, lt=0;

		for(int rt=0; rt<n; rt++){
			sum+=arr[rt];

			if(sum == m)answer++;
			while(sum >= m){
				sum-=arr[lt++];
				if(sum == m) answer++;
			}
		}
		return answer;
	}
}
