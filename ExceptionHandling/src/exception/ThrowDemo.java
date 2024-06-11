package exception;

public class ThrowDemo {
	
	static void demothrow() {
		try {
			throw new NullPointerException("demo");
			}
		catch(NullPointerException e) {
			System.out.println("caught inside demo");
			throw e;// rethrow the exception
		}
	}
	public static void main(String[] args) {
		try {
			demothrow();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught: "+e);
		}
	}


}
