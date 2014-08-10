package arraysample;

import  static java.lang.System.out;

import  java.util.Scanner;
import  java.io.PrintStream;
import  java.io.IOException;
import  java.io.File;

public class JavaArray {


	public static void main(String[] args) throws IOException{
		
		//Declaration of Variables
		
		String guestFilePath	= "/home/asadgenx/workspace/java/knowing_java_more/src/arraysample/guestList.txt";
		File fileHandle 			= new File(guestFilePath);
		Scanner keyBoard 		= new Scanner(System.in);
		Scanner diskScanner 	= new Scanner(fileHandle);
		int guestList[]			= new int [10];
		int roomNum;
		
		//Populating Guest List Array from the file
		
		for( roomNum = 0; roomNum < 10; roomNum++ ) {
			guestList[roomNum] = diskScanner.nextInt();
		}
		
		//Checking the vacancy from Guest List
		
		roomNum = 0;
		
		while( roomNum < 10 && guestList[roomNum] != 0 ) {
			roomNum++;
		}
		
		//Displaying information
		
		if( roomNum == 10 ) {
			out.println(" No Vacancy ");
		} else {
			out.println(" Room Number "+roomNum +" is available.");
			out.println( "How many People  for  Room Number "+roomNum +" ?");
			guestList[roomNum] = keyBoard.nextInt();
		}
		
		//Saving Array Data back to the file 
		PrintStream listOut 	= new PrintStream(fileHandle);
		
		for( roomNum = 0; roomNum < 10; roomNum++ ) {
			
			listOut.print(guestList[roomNum]);
			listOut.print("\t");
		}

		listOut.close();
		keyBoard.close();
		diskScanner.close();
	}

}
