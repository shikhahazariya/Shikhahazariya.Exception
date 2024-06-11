package exception;

public class Chained {
	public static void main(String[] args) {
		try {
			test();
		}
		catch(Application e) {
			System.out.println(e.getMessage());
		}
	}
	public static void test()throws Application{
		try {
			int a=0;
			int b=1;
			System.out.println(b/a);
			
		}
		catch(Exception e) {
			throw new Application(e);
		}
	}

}
class Application extends Exception{
	public Application(Exception e) {
		super(e);
	}
	
}
