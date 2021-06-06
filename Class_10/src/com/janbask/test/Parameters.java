package com.janbask.test;

public class Parameters {
	
	
	//Access modifiers  return type methodname(parameters/arguments)
	public  void method_name(String name,String Country, int Weight, String job) {
		
		System.out.println("my name is  --"+name);
		System.out.println("Country is  -- "+Country);
		System.out.println("Weight is  -- "+ Weight);
		System.out.println("job is  -- "+job);
		
	}
	
	
	public void age(int age) {
		
		System.out.println(" my age is -- "+age);
	}

	public static void main(String[] args) {
		
		
		//Class name object = new Class name
		Parameters p = new Parameters();	
		
		
		p.method_name("Bob", "India", 100, "sales");
		
		p.age(23);
		
		
		
		

	}

}
