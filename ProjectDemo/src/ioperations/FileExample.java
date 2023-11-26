package ioperations;

import java.io.File;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Folder Path : ");
		String folder = sc.nextLine();
		File file = new File(folder);
		//String fileNames[] = file.list();
		File fileNames[] = file.listFiles();
		for (File string : fileNames) {
			if(string.isHidden()) {
			System.out.println(file.getAbsolutePath());
			}
		}

	}

}
