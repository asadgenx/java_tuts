package helloWorld;

public class Exceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
		ExceptionsBase e = new ExceptionsBase();
		e.displayNumber();
		} catch( Exception e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
