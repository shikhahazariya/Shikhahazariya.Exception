package exception;


 class InvalidAgeException extends Exception
{
	public String toString()
	{
		return "Sorry valid age for recruitment is between 20-30";
	}
}
public class Recruitment {
	public void checkAge(int age)throws InvalidAgeException
	{
		System.out.println("Recruitment process started...");
		System.out.println("Age Scuitinization Going on....");
		if((age>=0 &&age <20)||(age >30))
		{
			System.out.println("Age is "+age);
			//invalidAgeExcetion iae=new InvalidAgeException;
			throw new InvalidAgeException();
		}
		else 
		{
			System.out.println("Age is "+age);
			System.out.println("Age Scuitinization is completed");
			System.out.println("further Recruitment process is continue .");
		}
		System.out.println("Age check is over");
	}
	public static void main(String[] args) {
		
		System.out.println("we are start recruitment process ");
		Recruitment rec=new Recruitment();
		try {
		rec.checkAge(20);
		rec.checkAge(30);
		rec.checkAge(26);
		rec.checkAge(40);
		
	}
	catch(InvalidAgeException iae) {
		System.out.println("Exception :"+iae);

	}
		System.out.println("Finished Scrutinization...");
		System.out.println("We are Exiting Main...");
}
}
