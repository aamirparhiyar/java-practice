package ioperations;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			File file = new File("newFile.txt");
			if(file.createNewFile()) {
				System.out.println("file created success!");
			}else {
				System.out.println("file exists already");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
