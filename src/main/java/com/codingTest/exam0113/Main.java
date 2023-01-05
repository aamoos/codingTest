package com.codingTest.exam0113;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}

		for(int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	public static ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);

		for(int i=1; i<n; i++){
			if(arr[i] > arr[i-1]){
				answer.add(arr[i]);
			}
		}

		return answer;
	}
}
