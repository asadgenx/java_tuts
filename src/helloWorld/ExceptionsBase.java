package helloWorld;

import java.util.Scanner;

public class ExceptionsBase {

	protected int number;
	
	public ExceptionsBase(){
		number = 5;
	}
	
	public int  displayNumber() {
		return number/0;
	}
	
	

}
