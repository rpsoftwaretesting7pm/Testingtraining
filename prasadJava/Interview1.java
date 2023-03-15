package com.javaprograms;

public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Factorial
     java.util.Scanner scn=new java.util.Scanner(System. in);
     System.out.println("Enter the Number");
     int a=scn.nextInt();
     int fact=1;
     for(int i=1;i<=a;i++)
     {
		fact=fact*i;
     }
     System.out.println("The Factorial of " +a+ " is "+fact);
	}

}
