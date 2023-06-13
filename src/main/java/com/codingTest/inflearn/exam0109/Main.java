package com.codingTest.inflearn.exam0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));
	}

	//g0en2T0s8eSoft
	public static int solution(String str){
		//아스키 number
//		int answer = 0;
//		for(char x : str.toCharArray()){
//			//숫자만
//			if(x>=48 && x<=57){
//				answer = answer*10+(x-48);
//			}
//
//		}

		//isDigit
		String answer = "";
		for (char x : str.toCharArray()){
			//숫자냐
			if(Character.isDigit(x)){
				answer+=x;
			}
		}


		return Integer.parseInt(answer);
	}
}
