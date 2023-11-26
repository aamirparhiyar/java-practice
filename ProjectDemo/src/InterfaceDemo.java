import java.util.*;
	
interface AdvancedArithmetic{
	  int divisor_sum(int n);
	}
interface Example {
	void print();
}

	class MyCalculator implements AdvancedArithmetic, Example {
	    public int divisor_sum(int n){
	        int divSum = 0;
	        for(int num = 1; num <=n; num++){
	            if(n%num == 0){
	                divSum += num;
	            }
	        }
	        return divSum;
	    }

		@Override
		public void print() {
			System.out.println("an other interface");
			
		}
	}

	class InterfaceDemo{
	    public static void main(String []args){
	        MyCalculator my_calculator = new MyCalculator();
	        System.out.print("I implemented: ");
	        ImplementedInterfaceNames(my_calculator);
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.print(my_calculator.divisor_sum(n) + "\n");
	      	sc.close();
	    }
	    /*
	     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
	     */
	    static void ImplementedInterfaceNames(Object o){
	        Class[] theInterfaces = o.getClass().getInterfaces();
	        for (int i = 0; i < theInterfaces.length; i++){
	            String interfaceName = theInterfaces[i].getName();
	            System.out.println(interfaceName);
	        }
	    }
	}

