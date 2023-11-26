package ioperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("G:\\ProjectDemo\\src\\ioperations\\file.txt");
			FileOutputStream out = new FileOutputStream("G:\\ProjectDemo\\src\\ioperations\\out.txt");
			int i = 0;
			while((i = in.read()) != -1) {
				out.write(i);
			}
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
