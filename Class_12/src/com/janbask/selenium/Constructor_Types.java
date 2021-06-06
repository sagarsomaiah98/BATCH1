package com.janbask.selenium;

public class Constructor_Types {
	
	Constructor_Types(){
		System.out.println(" Default Constructor");
	}
	
	// Constructor Overloading
	
	Constructor_Types(int a){
		System.out.println(" Parameterized Constructor == "+a);
		
	}
	Constructor_Types(int d, int e){
		System.out.println(" Parameterized Constructor == "+d+" & "+e);
		
	}
	Constructor_Types(String name, int age){
		System.out.println(" Parameterized Constructor == "+name+" & "+age);
		
	}
	
	

	public static void main(String[] args) {
		//Constructor_Types c= new Constructor_Types();
		
		Constructor_Types  c4 = new Constructor_Types("Jean" ,22);
		
		Constructor_Types c1= new Constructor_Types(20,40);
		Constructor_Types  c2 = new Constructor_Types(15);
		Constructor_Types  c3 = new Constructor_Types(12,56);
		
		
		
		
		
	}

}
