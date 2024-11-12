package training1016.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Day11 {

	public static void main(String[] args) throws FileNotFoundException  {
		
		try {
			System.out.println(5/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}

	}

}
