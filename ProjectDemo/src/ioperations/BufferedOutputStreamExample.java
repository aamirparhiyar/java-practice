package ioperations;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		try {
			BufferedOutputStream bfOut = new BufferedOutputStream(new FileOutputStream("G:\\ProjectDemo\\src\\ioperations\\file.txt"));
			String s = "Hello World!";
			bfOut.write(s.getBytes());
			bfOut.flush();
			bfOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
