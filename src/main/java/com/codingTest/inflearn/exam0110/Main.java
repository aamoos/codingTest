package com.codingTest.inflearn.exam0110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");

		char c = strArr[1].charAt(0);

		for (int x : solution(strArr[0], c)) {
			System.out.print(x+" ");
		}
	}

	//g0en2T0s8eSoft
	public static int[] solution(String str, char t){
		int[] answer = new int[str.length()];
		int p = 1000;
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == t){
				p=0;
				answer[i] = p;
			}
			else{
				p++;
				answer[i] = p;
			}
		}
		p=1000;
		for(int i=str.length()-1; i>=0; i--){
			if(str.charAt(i) == t){
				p=0;
			}
			else{
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
}
