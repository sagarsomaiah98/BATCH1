package Rev;

public class Method_Overloading {
	
	public void method1(String name) {
		
		System.out.println(" this is method 1 with arguments name "+ name);
	}
	
	public void method1(int age) {
		
		System.out.println(" this is method 1 with arguments age "+ age);
		
	}
	
	public void method1(int age,String name) {
		
		System.out.println(" this is method 1 with arguments  name and age "+name +"  &"+age );
		
	}

	public static void main(String[] args) {
		Method_Overloading m = new Method_Overloading();
		m.method1(23);
		m.method1("dean");
		m.method1(52, "kevin");

	}

}
