package exception;

public class MultipleTryCatch {
	
	public static void main(String[] args) {
		//main try block
		try {
			//try block 2
			try {
				// try block 3
				try {
					int arr[]= {1,2,3,4};
					/*I'm trying to display the value of 
					 * *an element which does't exit. the
					 * code should throw an exception
					 */
					System.out.println(arr[10]);
				}
					
					catch(ArithmeticException e) {
						
						System.out.println("Arithmetic Exception");
						System.out.println("handle in try block");
						
					}
					 
				}
				catch(ArithmeticException e1) {
					System.out.println("Arithmetic Exception");
					System.out.println("handle in try block");
					
				}
			}
			catch(ArithmeticException e2) {
				System.out.println("Arithmetic Exception");
				System.out.println("handle in try block");
				
				
			}
		
		catch(ArrayIndexOutOfBoundsException e3) {
			
			System.out.println("ArrayIndexOfBoundsException");
			System.out.println("handle in main try block");
			
		}
	
	}

}
