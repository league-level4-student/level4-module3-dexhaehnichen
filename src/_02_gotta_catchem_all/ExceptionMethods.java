package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divide(double a, double b) throws IllegalArgumentException{
		if(b == 0.0) {
			throw new IllegalArgumentException();
		}
		
		double result = a/b;
		
		return result;
	}
	
	public static String reverse(String s) throws IllegalStateException {
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		
		StringBuilder builder = new StringBuilder(s);
		s = builder.reverse().toString();
		
		return s;
	}
	
}
