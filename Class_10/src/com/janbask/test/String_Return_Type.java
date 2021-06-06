package com.janbask.test;

public class String_Return_Type {
	
	
	public static String String_function(String name) {
		
		//name="WELCOME TO";
		
		String place="USA";
		String job="Tester";
		String gender=" male";
		
		String color=" Red";
		
		
		color= color+place;// RedUSA
		job= place+gender;// USAmale
		place= job+color; // USAmaleRedUSA
		
		place =name+color;//WELCOME TORedUSA
		
		
		
		
		
		return place;
		
      

		
		
	}

	public static void main(String[] args) {
		
		     
		//W-0 E-1 L-2 C-3 
		//System.out.println(String_function("WELCOME TO "));
		
		String request= "Leave Request (2021-04-20 to 2021-04-22) Manali Kulkarni";
		
		String start_date=request.substring(15,25);
		System.out.println(start_date);
		
		
		
		

	}

}
