
public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		arr[0] = 5;
		arr[1] = 6;
		printArray(arr);
	}
	
	public static void printArray(int arr[] ) {
		for(Object val : arr) {
			System.out.println(val.getClass().getMethods());
		}
	}

}
