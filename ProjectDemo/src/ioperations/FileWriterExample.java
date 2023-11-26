package ioperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("G:\\ProjectDemo\\src\\ioperations\\filewriter.txt");
			String s = "\nwriting into file using file writer!";
			fw.append(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
