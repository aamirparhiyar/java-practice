package ioperations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("G:\\ProjectDemo\\src\\ioperations\\file.txt");
			String s = "Hello world";
			writer.write(s);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
