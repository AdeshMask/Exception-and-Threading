package Exceptions;

/*
 * Exception is an unwanted or unexpected event, which occurs during the execution 
 * of a program, i.e. at run time, that disrupts the normal flow of the program’s 
 * instructions. Exceptions can be caught and handled by the program.
 * 
 * Exception Handling in Java is one of the effective means to handle the 
 * runtime errors so that the regular flow of the application can be preserved. 
 * Java Exception Handling is a mechanism to handle runtime errors such as 
 * ClassNotFoundException, IOException, SQLException, RemoteException, etc.
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Welcome to Exception Handling:");
		/*
		 * There are two types of exception Built-in and User defined.
		 * There are two types of Built-in Exceptions == > 1) Checked Exception and 
		 * 												   2) Unchecked Exception.
		 */
		System.out.println("Example of User Defined Exception:");
		int a = 5;
		int b = 0;
		division(a, b);
		System.out.println("Exception Thrown");
		/*
	     * Checked Exceptions:==> Checked exceptions are called compile-time exceptions 
	     * because these exceptions are checked at compile-time by the compiler.
	     * 
	     * Unchecked Exceptions:==> The unchecked exceptions are just opposite to the 
	     * checked exceptions. The compiler will not check these exceptions at 
	     * compile time. In simple words, if a program throws an unchecked exception,
	     * and even if we didn’t handle or declare it, the program would not give a 
	     * compilation error.
	     */
		try {
			int c = divisionThrow(a, b);
		}
		catch (ArithmeticException ex){
			System.out.println(ex.getMessage());
		}  
	}
	
	/*
	 * This method Throws Exception(ArithmaticException)
	 */
	private static int divisionImplementation(int a, int b) {
		int i = a / b;   //This statement will cause ArithmaticException.
		return i;
	}
	
	private static int divisionThrow(int a, int b) {
		int result = 0;
		/*
		 * This try block is checking for the exception.
		 */
	    try{
	       result = divisionImplementation(a, b);
	    }
	    
	    catch(ArithmeticException e){
	    	/*
	    	 * If Exception occurs then this message display.  
	    	 */
	    	System.out.println("NumberFormatException is occurred.");
	    }
		return result;
	}
	
	private static void division(int x, int y) {
	    try{
	       System.out.println(x/y);
	    }
	    catch(ArithmeticException e){
	    	System.out.println(e.toString());
	    	System.out.println(" Printing Exception ");
	    	e.printStackTrace();
	    }
	}
}
