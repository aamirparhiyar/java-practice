
public class FindGCDByUsingRecursion {

	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			int reminder = x % y;
			System.out.println(x + " % " + y + " = " + reminder);
			
			return gcd(y,reminder);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(gcd(235,75));
		loopUsingRecursion(10);
	}
	
	public static void loopUsingRecursion(int range) {
		if(range == 1) {
			System.out.println(range);
		}else {
			System.out.println(range);
			loopUsingRecursion(range - 1);
		}
	}

}
