package com.javaprograms;

public class Constructor {

	Constructor(){
		System.out.println("Default Construtor");
	}
	Constructor(int a){
		System.out.println("Parameterised  Construtor");
		System.out.println("a="+ a);
	}
	static int i;
	static void m1() {
		System.out.println("m1 metod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Constructor c=new Constructor();
    Constructor c1=new Constructor(45);
    m1();
    
	}

}
