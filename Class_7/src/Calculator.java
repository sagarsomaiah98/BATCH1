
public class Calculator {
	
	//methods
	                     //arguments or parameters 
	public void addition(double a, int b) {
		
		
		double sum=a+b;
		
		System.out.println("addition of " +a+" and "+ b +" equals to = "+sum);
		
	}
	
	public void subtraction() {
		int first=50;
		int second=30;
		
		int sub=first-second;
		
		System.out.println("subtraction of " +first+" and "+ second +" equals to = "+sub);
		
	}
//main function
	public static void main(String[] args) {
		
		Calculator cal= new Calculator();
		cal.addition(20,10);
		cal.addition(70,30);
		cal.addition(80,60);
		cal.addition(7,60);
		cal.addition(8,60);
		cal.addition(8,60);
		cal.addition(6,60);
		cal.addition(80,60);
		cal.addition(80,60);
		cal.addition(80,60);
		
		
		
		

	}

}
