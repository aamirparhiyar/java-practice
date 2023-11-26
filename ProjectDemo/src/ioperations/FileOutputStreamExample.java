package ioperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args)  {
		FileOutputStream out;
		try {
			String s = "This is test string!";
			out = new FileOutputStream("G:\\ProjectDemo\\src\\ioperations\\file.txt");
			out.write(s.getBytes());
			out.close();
			System.out.println("write completed.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
