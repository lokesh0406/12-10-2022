package com.collections.demo;

public class Collection {

	public static void main(String[] args) {
	
		String s1 ="Hi, welcome to this mentoring session";
		
		for(String word: s1.split(" ")) {
			
			System.out.println(word);
		}
	}

}
