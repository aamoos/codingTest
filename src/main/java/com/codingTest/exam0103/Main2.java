package com.codingTest.exam0103;

import java.io.IOException;
import java.util.Scanner;

// indexOf, subString
public class Main2 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print(solution(str));
	}


	public static String solution(String str){
		String answer = "";
		int m = Integer.MIN_VALUE, pos;

		while((pos=str.indexOf(" ")) != -1){
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m){
				m = len;
				answer=tmp;
			}
			str = str.substring(pos+1);
		}

		if(str.length() > m){
			answer = str;
		}

		return answer;
	}
}
