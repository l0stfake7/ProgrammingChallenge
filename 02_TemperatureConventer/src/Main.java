import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programming Challenge - 02 - Temperature Conventer");
		System.out.println("Type source scale (a - Celsius, b - Fahrenheit or c - Kelvin)");
		char scaleSource = scanner.next().charAt(0);
		
		System.out.println("Type destination scale (a - Celsius, b - Fahrenheit or c - Kelvin)");
		char scaleDestination = scanner.next().charAt(0);

		if((scaleSource == 'a' || scaleSource == 'b' || scaleSource == 'c') && 
		  (scaleDestination == 'a' || scaleDestination == 'b' || scaleDestination == 'c')) {
			System.out.println("Type temperature in floating point");
			float temperature = scanner.nextFloat();
			
			TemperatureConverter.ConverterTemperature(temperature, TemperatureScale.Celsius, TemperatureScale.Celsius);
		}		
		else {
			System.out.println("Bad char, try again");
		}

		scanner.close();
		
	}

}
