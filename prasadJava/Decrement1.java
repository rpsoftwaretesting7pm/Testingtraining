package com.javaprograms;

public class Decrement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=2;

		a=--a - b--;

		b=a-- - --b;

		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
