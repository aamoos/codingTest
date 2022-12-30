package com.codingTest.exam0108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));
	}

	public static String solution(String str){
		String answer = "YES";

		String match = "[^a-zA-Z]";
		str = str.replaceAll(match, "");

		//내가 푼거
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		String reverseStr = sb.reverse().toString();

		if(str.equals(reverseStr)){
			answer = "YES";
		}else{
			answer = "NO";
		}
		return answer;
	}
}
