package com.javaprograms;

public class MultipleconswithThis {
	MultipleconswithThis(){
		this(49);
		System.out.println(" Default Construtor");
	}
	
	MultipleconswithThis(int a){
		this("Prasad");
		System.out.println("Construtor with int Parameters");
	}
	
	MultipleconswithThis(String s){
		System.out.println(" Constructor with String Parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  MultipleconswithThis m =new MultipleconswithThis();
      
	}

	
}
