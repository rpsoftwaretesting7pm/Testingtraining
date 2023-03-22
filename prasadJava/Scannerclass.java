package com.javaprograms;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your Name");

		Char N =sc.next().charAt(0);


		System.out.println("Enter Age");

		int A=sc.nextInt();

		System.out.println("My Name is "+N+ " and my age is "+A);


	}

}
