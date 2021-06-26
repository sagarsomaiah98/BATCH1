package Rev;

public class Array_Creation {

	public static void main(String[] args) {
		
		
		String[] students = new String[5];
		students[0]="Mark";
		students[1]="Steve";
         students[2]="Andy";
         students[3]="henry";

         students[4]="Sam";
         
			/*
			 * System.out.println(students[0]); System.out.println(students[1]);
			 * System.out.println(students[2]); System.out.println(students[3]);
			 * System.out.println(students[4]);
			 */
       //  System.out.println(students[5]);
         
         System.out.println("size of array "+students.length);
         
         for( int k=0;k<students.length;k++)
        	 
         {  System.out.println(students[k]);
        	 
         }
        
         
		
		

	}

}
