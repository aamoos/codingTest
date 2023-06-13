package com.codingTest.inflearn.exam0205;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();

		for(int x : solution(n)){
			System.out.print(x+" ");
		}

	}

	public static int[] solution(int n){
		int[] answer = new int[n];
		answer[0]=1;
		answer[1]=1;

		for(int i=2; i<n; i++){
			answer[i]=answer[i-2]+answer[i-1];
		}

		return answer;
	}

	public static void solution2(int n){
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}



}
