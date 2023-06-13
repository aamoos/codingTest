package com.codingTest.exam0101;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c = scan.next().charAt(0);
		System.out.print(solution(str, c));
	}

	public static int solution(String str, char t){
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		//System.out.println(str+" "+t);

		for (char x : str.toCharArray()) {
			if(x == t){
				answer++;
			}
		}

		return answer;
	}
}
