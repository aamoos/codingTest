package com.codingTest.exam0213;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++){
			a[i]= scan.nextInt();
		}
		int m = scan.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++){
			b[i] = scan.nextInt();
		}
		for(int x : solution(n, m, a, b)){
			System.out.print(x+" ");
		}

 	}

	public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;

		while(p1<n && p2<m){
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}

		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);

		return answer;
	}
}
