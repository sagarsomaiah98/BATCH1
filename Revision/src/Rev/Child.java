package Rev;

public class Child extends Parent {
	
	public void method3() {
		
		System.out.println("method 3 in child class");
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.method1();
		c.method2();
		c.method3();
		System.out.println(c.age);
		System.out.println(c.name);

	}

}
