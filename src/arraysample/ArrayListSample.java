package arraysample;

import static java.lang.System.out;

import  java.util.ArrayList;

public class ArrayListSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String gxString[] 							= {"Asad","Genx","Almighty","Mummy"};
//		ArrayList   gxStringSorter				=  new ArrayList(); 					// Old-Style ArrayList Initialization
//		ArrayList<String> gxStringSorter	=  new ArrayList<String>();		// After Java 5 
		ArrayList<String> gxStringSorter	=  new ArrayList<>();				//After Java 7 it has diamond <> operator
		
		if( gxString.length >0 ) {
			for( String name: gxString ) {
				gxStringSorter.add(name);
			}
		}
		
	  out.println("Before Sorting:");
	  out.println("-----------------------");
	   for( String name : gxStringSorter ) {
		   out.println(name);
	   }
	   
	  if ( gxStringSorter.contains("Almighty") ) {
		  
		  gxStringSorter.remove("Almighty");
		  gxStringSorter.add(0,"Almighty Allah");
	  }
	  
	  out.println("After Sorting:");
	  out.println("-------------------");
	  for( String name : gxStringSorter ) {
		 
		   out.println(name);
	   }
		
	}

}
