
public class InnerClassDemo {
	boolean isOuter = false;
	private class Inner {
		String name = "This That" + isOuter;
	}
	
	public static void main(String args[]) {
		InnerClassDemo outerClass = new InnerClassDemo();
		InnerClassDemo.Inner innerClass = outerClass.new Inner(); 
		System.out.println(outerClass.isOuter + " : " + innerClass.name);
	}
}

