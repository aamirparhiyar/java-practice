package ioperations;

import java.io.Console;

public class ReadStringTest {

	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("Please Enter name : ");
		String name = c.readLine();
		System.out.print("Enter Password : ");
		char[] pass = c.readPassword();
		System.out.println("Welcome, " + name);
		System.out.println("Pass :" + new String(pass));

	}

}
