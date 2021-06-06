
public class Global_Variables {
	
	// Variable can be defined in two ways
	// 1. Global Variable - Class Level
	// 2. Local Variable - inside method
	
	int b=10;// class level
	
	
	
	public void method1() {
		
		int a=20; //Local variables or method variable
		
		System.out.println(a);
		System.out.println(" b value -- "+b);
		
	}
	
	public void method2() {
		
		int a=30;
		
		System.out.println(a);
		System.out.println(" b value -- "+b);
	}

	public static void main(String[] args) {
		Global_Variables gv= new Global_Variables();
		
		System.out.println(gv.b);
		
		gv.method1();
		gv.method2();

	}

}
