package exception;

public class HandleArithmeticException {
	public static void main(String[] args) {
		
		int a,b;
		try {// monitor to handle error
			a=0;
			b=23/0;
			
			System.out.println("this will not printed");
			
			}
		catch(ArithmeticException e){// catch divide by zero error 
			System.out.println("Division by zero");
		}
	}

}
