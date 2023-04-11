package com.Stringprograms;

public class Stringprogram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="Java Program";
	String s1="";
		
	int n=s.length()-1;
		for(int i=n;i>=0;i--)
		{
			char c=s.charAt(i);
			s1=s1+c;
		}
		
		System.out.println(s1);
	}

}
