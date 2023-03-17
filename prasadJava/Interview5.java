package com.javaprograms;

public class Interview5 {

	public static void main(String[] args) {
		// 121 1234321 
		java.util.Scanner scn=new java.util.Scanner(System. in);
	     System.out.println("Enter the Number");
	     int n=scn.nextInt();
	     int a=n;
	     int sum=0;
	     
	     while(n!=0) {
	    	 
	    	 int r=n%10;
	    	 sum=sum*10+r;
	    	 n=n/10;
	     }
	     
	     if (sum==a) {
	    	 
	    	 System.out.println(a+ " is a Pallindrome Number");
	    	 
	     } else {
	    		 System.out.println(a+ " is not a pallindrome Number");
	    	 }
	     }

	}


