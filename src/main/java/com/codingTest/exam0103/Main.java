package com.codingTest.exam0103;

import java.io.IOException;
import java.util.Scanner;

// split
public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print(solution(str));
	}


	public static String solution(String str){
		String answer = "";
		int m = Integer.MIN_VALUE;

		String[] s = str.split(" ");

		for (String x : s) {
			int len = x.length();

			if(len > m){
				m = len;
				answer=x;
			}
		}
		return answer;
	}
}
