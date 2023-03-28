package com.javaprograms;

public class Multipleconstructors {
	
	Multipleconstructors(){
		System.out.println(" Default Construtor");
	}
	
	Multipleconstructors(int a){
		System.out.println("Construtor with int Parameters");
	}
	
	Multipleconstructors(String s){
		System.out.println(" Constructor with String Parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Multipleconstructors m =new Multipleconstructors();
      Multipleconstructors m1 =new Multipleconstructors(85);
      Multipleconstructors m2 =new Multipleconstructors("Prasad");
      
	}

}
