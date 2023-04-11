package com.Stringprograms;

public class Stringprogram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Developer";
		//Vowels
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e'||c=='i'||c=='o' || c=='u')
			{
				if (s1.indexOf(c)==-1)
				{
					s1=s1+c;
				}
				
			}
		}
		System.out.println("Vowels"+s1);
	}

}
