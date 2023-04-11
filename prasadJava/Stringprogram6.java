package com.Stringprograms;

public class Stringprogram6 {

	public static void main(String[] args) {
		
		String s="Jav23456va De8345698velo879765per";
		String s1="";
		for(int i=1;i<s.length();i++) {
			
			char c=s.charAt(i);
			if(c>='0'&&c<='9' )
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);

	}

}
