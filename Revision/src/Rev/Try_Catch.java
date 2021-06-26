package Rev;

public class Try_Catch {

	public static void main(String[] args) {
	
		
		try {
			        //0 1 2 3 4
			int[] a= {1,2,3,4,5};
			
			System.out.println(a[5]);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("in catch block");
			
			
		}

	}

}
