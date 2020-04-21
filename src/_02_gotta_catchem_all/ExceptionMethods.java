package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divide(double a, double b) throws IllegalArgumentException{
		double result = a/b;
		
		if(result == 0.0) {
			throw new IllegalArgumentException();
		}
		
		return result;
	}
}
