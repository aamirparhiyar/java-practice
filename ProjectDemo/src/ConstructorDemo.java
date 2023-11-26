class EncapDemo {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EncapDemo getName() {
		return this;
	}
	
	@Override
	public String toString() {
		return "Name : " + name;
	}
}
public class ConstructorDemo {

	int num;
	ConstructorDemo(int num){
		this.num = num;
	}
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo(5);
		EncapDemo encapObj = new EncapDemo();
		encapObj.setName("hyder");
		System.out.println(encapObj.getName());
	}

}
