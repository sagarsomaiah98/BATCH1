
public class Loops {
	
	public void for_loop() {
		
	for(int i=0;i<10;i++) {
			
			System.out.println(" printing loop " + i);
		}
		
		
	}
	
	public void while_loop() {
		int i=1;
		
		while(i==1)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void do_while() {
		
		int i=10;
		do {
			System.out.println(i);
			
		}
		while (i==2);
	}

	public static void main(String[] args) {
		
		
	Loops l= new Loops();
l.for_loop();
	//l.while_loop();
//	l.do_while();
		
		

	}

}
