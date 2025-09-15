package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {

	static void print()throws FileNotFoundException,IOException
	{
		File newFile=new File("test.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	}
	public static void main(String[] args) {
		
		
		try
		{
			print();
		}
//			catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		catch (IOException e) {
			System.out.println("input file not present");
			System.out.println(e.getMessage());
		}
	}
}
