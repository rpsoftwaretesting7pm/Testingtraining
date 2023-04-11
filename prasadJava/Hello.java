package com.Stringprograms;

public class Hello {

	public static void main(String[] args) {
		// string literal
		String s=new String("Hello");
		String s1="Hello";
		final String s2="Hello";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s1==s2);
		String s3=new String("Hello");
		System.out.println(s==s3);
		String s4="Hello World";
		String s5=s2+"World";
		System.out.println(s4==s5);
		
		

	}

}
