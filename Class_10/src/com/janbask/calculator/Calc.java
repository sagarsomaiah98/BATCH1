package com.janbask.calculator;

public class Calc {
	
	
	//Return type
	//public void add( int v1, int v2)
	
	
	public int add(int v1, int v2) {//  return type which is integer
		
		
		
		int sum= v1+v2;
		
		return sum;
	}
	
	public int sub(int v1, int v2) {//  return type which is integer
		
		
		
		int sub= v1-v2;
		
		return sub;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calc c= new Calc();
		
		int output=c.sub(20, 30);
		
		int output1= c.sub(41, 20);
		
		System.out.println(output);
		
		System.out.println(output1);
		
		
		
		

	}

}
