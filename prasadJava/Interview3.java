package com.javaprograms;

public class Interview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibnaocci Series
	     java.util.Scanner scn=new java.util.Scanner(System. in);
	     System.out.println("Enter the first Number");
	     int a=scn.nextInt();
	     System.out.println("Enter the Second Number");
	     int b=scn.nextInt();
	     System.out.println("Enter the Series");
	     int n=scn.nextInt();
	     System.out.print(a+ " ");
	     System.out.print(b+ " ");
	     for(int i=1;i<=n;i++)
	     {
	    	 int c=a+b;
	    	 System.out.print(c+ " ");
	    	 a=b;
	    	 b=c;
	    	 
	     }
	}

}
