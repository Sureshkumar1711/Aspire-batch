package exceppack;

public class ExceptionDemo {
public static void main(String[] args) {
	
	System.out.println("Before Exception");
	try {
	int i= 1/Integer.parseInt(args[0]);
//	}catch(ArithmeticException e) {
		
//		System.out.println(e);
	}catch(NumberFormatException ae) {
		
		System.out.println(ae);
	}catch(ArrayIndexOutOfBoundsException ne) {
		
		System.out.println(ne);
	}catch(Exception e) {
		
		System.out.println(e);
	}
	finally {
		
		System.out.println("Finally called.");
	}
	
	System.out.println("After Exception");
}
}
