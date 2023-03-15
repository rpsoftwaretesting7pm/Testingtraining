package com.javaprograms;

public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prime Number
	     java.util.Scanner scn=new java.util.Scanner(System. in);
	     System.out.println("Enter the Number");
	     int n=scn.nextInt();
	     int a=1;
	     for(int i=2;i<n;i++)
	     {
			if(n%i==0)
			{
				a=0;
				break;
			}
	     }
	     if(a==1) {
	     System.out.println(n+ " is a prime number ");
	     }else
	     {
	    	 System.out.println(n+ " is not a prime number "); 
	     }
	     }
	}


