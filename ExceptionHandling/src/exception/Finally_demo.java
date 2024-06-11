package exception;

public class Finally_demo {
	public static void main(String [] args) {
		try {
			//below code do not throw any Exception
			
			int data=25/5;
			System.out.println(data);
		}
		// catch won't be executed
		catch(NullPointerException e) {
			System.out.println(e);
			 
		}
		finally {
			System.out.println("finally block is always execued");
			
		}
		System.out.println("rest of code");
		
	}

}
