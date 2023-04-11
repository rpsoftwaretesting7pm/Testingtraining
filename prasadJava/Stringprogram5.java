package com.Stringprograms;

public class Stringprogram5 {

	public static void main(String[] args) {
		
		String s="Java Developer";
		//unique Character Jav Delopr
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1)
			{
				s1=s1+c;
			}
		}
		
		System.out.println("Unique Character="+s1);
	}

}
