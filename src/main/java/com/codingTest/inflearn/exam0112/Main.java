package com.codingTest.inflearn.exam0112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(solution(n, str));
	}

	public static String solution(int n, String s){
		String answer = "";

		for (int i=0; i<n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer+= (char) num;
			s = s.substring(7);
		}

		return answer;
	}
}
