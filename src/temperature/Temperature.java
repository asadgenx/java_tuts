package temperature;
import static java.lang.System.out;

public class Temperature {

	private double number;
	private TempScale scale;
	private char TempUnit;
	
	public Temperature( double number, TempScale scale ){
		this.number = number;
		this.scale = scale;
		assignTempUnit();
	}
	
	public void assignTempUnit(){
		switch(scale){
		
		case KELVIN:
			this.TempUnit = 'K';
			break;
			
		case FARENHEIT:
			this.TempUnit = 'F';
			break;
			
		case CELSIUS:
			this.TempUnit = 'C';
			break;
		
		default:
			this.TempUnit = 'X';
			break;
		}
	}
	public void displayTemp( ){
		
		
		out.printf("Its %3.2f degrees %s (%c)\n", number, scale, TempUnit);
	}
	
}

