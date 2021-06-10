package com.crm.util;

public class TestUtil {
	
	public static String random_String() {
		
		String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) {
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		}
		System.out.println(value);
			return value;	
				
	}
	
	
	

}
