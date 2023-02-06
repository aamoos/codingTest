package com.codingTest.inflearn.exam0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine().toLowerCase();
		char b = br.readLine().toLowerCase().charAt(0);
		int count = 0;

		//향상된 for문
		for (char x : a.toCharArray()) {
			if(b == x){
				count++;
			}
		}

		//for문
//		for (int i=0; i<a.length(); i++){
//			if(b == a.charAt(i)){
//				count++;
//			}
//		}
		System.out.println(count);
	}
}
