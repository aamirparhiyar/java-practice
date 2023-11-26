package ioperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("G:\\ProjectDemo\\src\\ioperations\\file.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
