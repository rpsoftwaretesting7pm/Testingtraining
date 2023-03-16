package com.javaprograms;

public class Interview4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scn=new java.util.Scanner(System. in);
	     System.out.println("Enter the Number");
	     int n=scn.nextInt();
	     int a=n;
	     int sum=0;
	     while(n>0)
	     {
	    	 int r=n%10;
	    	 sum=sum+r;
	    	 n=n/10;
	     }
	System.out.println("the sum of the digits of "+a+ " is "+sum);
	}
	

}
