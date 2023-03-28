package com.javaprograms;

public class Nonstaticvariable {

	static String name;
	int age;
	char c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(name);
     
     Nonstaticvariable nsv= new Nonstaticvariable();
     
     nsv.age= 123;
     nsv.c='m';
     System.out.println("Value= "+nsv.age +" c="+nsv.c);
     
     nsv.method2();    

}
	 public void method2() {

	     System.out.println("i= 23456 ");
	     
	     
	     }
}