package com.codingTest.exam0106;

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
		String answer = "";
		for(int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i)+ " "+i+" "+str.indexOf(str.charAt(i)));

			if(str.indexOf(str.charAt(i)) == i){
				answer += str.charAt(i);
			}
		}
		return answer;
	}
}
