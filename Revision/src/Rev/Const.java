package Rev;

public class Const {
	
	public Const() { // defaut constructor
		
		System.out.println("default");
	}
	
	public Const(String name) {
		
		System.out.println(" passing name  -- "+name);
	}

	
public Const(int  age) {
		
		System.out.println(" age  -- "+age);
	}

	public static void main(String[] args) {
		
		  Const c= new Const();
	Const c1= new Const("john");
		Const c2= new Const(23);
		

	}

}
