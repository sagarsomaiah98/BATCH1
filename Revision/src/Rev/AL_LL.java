package Rev;

import java.util.LinkedList;
import java.util.List;

public class AL_LL {

	public static void main(String[] args) {
		
		//List<String > students= new ArrayList<String>();
		List<String > students= new LinkedList<String>();
		
		students.add("Steve");
		students.add("will");
		students.add("andrew");
		students.add("bruce");
		students.add("kevin");
		students.add("jazz");
		students.add("bob");
		
		System.out.println("size of students arraylist == "+students.size());
		
		/*
		 * System.out.println(students.get(0));
		 * 
		 * System.out.println(students.get(1)); System.out.println(students.get(2));
		 * System.out.println(students.get(3)); System.out.println(students.get(4));
		 * System.out.println(students.get(5));
		 */
		
		//for loop
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		
	}

}
