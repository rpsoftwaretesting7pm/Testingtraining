package com.javaprograms;

public class Interview6 {

	public static void main(String[] args) {
		// Amstrong Number
		java.util.Scanner scn=new java.util.Scanner(System. in);
	     System.out.println("Enter the Number");
	     int n=scn.nextInt();
	     int a=n;
	     int sum=0;
	     
	     while(n>0) {
	    	 int r=n%10;
	    	 sum=sum+r*r*r;
	    	 n=n/10;
	     }
if (sum==a) {
	    	 
	    	 System.out.println(a+ " is a Amstrong Number");
	    	 
	     } else {
	    		 System.out.println(a+ " is not a Amstrong Number");
	    	 }
	}

}
