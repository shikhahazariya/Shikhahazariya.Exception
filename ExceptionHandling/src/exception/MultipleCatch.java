package exception;

public class MultipleCatch {
	public static void main(String[] args) {
	try {
		int arr[]=new int[4];
		arr[4]=30/0;
	}
	catch(ArithmeticException e) {
		 System.out.println("Arithmetic Exception occur");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println("ArrayIndexOutofBoundException occur");
		
	}
	catch(Exception e) {
		System.out.println("Parent Exception");
	}
	}

}
