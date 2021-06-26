package Rev;

public class HDFC_Bank implements Bank_interface {

	public static void main(String[] args) {
	
		HDFC_Bank b= new HDFC_Bank();
		b.method1();
		b.method2();
		b.method3();

	}


	public void method1() {
		System.out.println("hdfc method 1");
		
	}

	
	public void method2() {
		System.out.println("hdfc method 2");
		
	}


	@Override
	public void method3() {
		System.out.println("hdfc method 3");
	}
	
	
}
