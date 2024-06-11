package exception;

 class myException extends Exception
    {
	private int x;
	myException(int a)
	{
		x=a;
	}
	public String toString()
	{
		return "myException[" +x + "]is less than zero";
		
	}

}
public class MyException{
	 static void sum(int a,int b) throws myException
	 {
		if(a<0)
		{
			throw new myException(a);//calling construction of user defind Exception class
			
		}
		else 
		{
			System.out.println(a+b);
			
	    }
	
}

public static void main(String []args) {
	try
	{
		sum(-10, 10);
	}
	catch(myException me) {
		System.out.println(me);// its call toString() method of user-defind Exception
	}
	
}
}