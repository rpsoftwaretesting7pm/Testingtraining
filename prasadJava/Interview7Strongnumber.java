package com.javaprograms;

public class Interview7Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scn=new java.util.Scanner(System. in);
	     System.out.println("Enter the Number");
	     int n=scn.nextInt();
	     int a=n;
	     int sum=0;
	     
	     while(n>0) {
	    	 int r=n%10;
	    	 int p=1;
	    	 int q=1;
	    	 
	    	 while(p<=r) {
	    		 q=q*p;
	    		 p++;
	    	 }
	    	 
	    	 sum=sum+q;
	    	 n=n/10;
	     }
	     if(a==sum) {
	    	 System.out.println(a+ " is a strong Number");
	     }
	     else {
	    	 System.out.println(a+ " is not a strong Number");
	     }
	}

}
