package com.janbask.test;

public class Multiple_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 30; int b=80; int c=40;
		
	// a>b
	//a>c
  // then a is greater
		//AND operator
		
	/*	if(a>b && a>c)// a>b = false & a>c= true
			System.out.println(" a is greater");
		

	}*/
		// OR Operator
		
		if(a>b || a>c)// a>b = false & a>c= false
			System.out.println(" a is greater");

}
}
