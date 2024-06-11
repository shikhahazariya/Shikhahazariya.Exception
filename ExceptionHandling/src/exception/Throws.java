package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Throws {

	public static void findfile()throws IOException{
		// throws that may produce IOExcetion
		File newfile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newfile);
		
	}
	public static void main(String[] args) {
		try {
			findfile();
			}
		catch(IOException e) {
			System.out.println(e);
		}


		
	}
}
