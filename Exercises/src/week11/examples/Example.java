package week11.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
	public static int getElement(int index) {
		int[] arr = { 3, 4, 5 };
		return arr[index];
	}
	public static char readLine() throws FileNotFoundException,IOException  {
		File file=new File("c:\test.txt");
		FileInputStream reader=new FileInputStream(file);
		return (char)reader.read();
		
	}
}
