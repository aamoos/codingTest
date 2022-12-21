package com.codingTest.exam0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int max = 0;
		String result = "";
		for (String s : arr) {
			if(max == 0){
				max = s.length();
				result = s;
			}else{
				if(max < s.length()){
					max = s.length();
					result = s;
				}
			}
		}
		System.out.println(result);
	}
}
