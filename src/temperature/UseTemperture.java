package temperature;

public class UseTemperture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature obj = new Temperature(220,TempScale.KELVIN);
		obj.displayTemp();
		Temperature obj2 = new Temperature(100,TempScale.CELSIUS);
		obj2.displayTemp();
	}

}
