import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Programming Challenge - 02 - Temperature Conventer");
			System.out.println("Type source scale (Celsius, Fahrenheit or Kelvin)");
			String scaleSource = scanner.next();

			System.out.println("Type destination scale (Celsius, Fahrenheit or Kelvin)");
			String scaleDestination = scanner.next();

			boolean[] match = new boolean[2];
			for(TemperatureScale ts: TemperatureScale.values()) {
				
				if(scaleSource.equalsIgnoreCase(ts.toString())) {
					match[0] = true;
					continue;									
				}
				else if(scaleDestination.equalsIgnoreCase(ts.toString())) {
					match[1] = true;
					continue;
				}				
			}
			if(match[0] == false || match[1] == false) {
				throw new MyException("Bad chose, available scales(Celsius, Fahrenheit or Kelvin)!");
			}
			if(scaleSource.equals(scaleDestination)) {
				throw new MyException("Bad chose, same scales!");
			}
			
			System.out.println("Type temperature (use \",\" instead \".\")");
			float temperature = scanner.nextFloat();
			
			System.out.println(TemperatureConverter.ConverterTemperature(temperature, TemperatureScale.valueOf(scaleSource.toUpperCase()), TemperatureScale.valueOf(scaleDestination.toUpperCase())));
			scanner.close();
		
		}
		catch(MyException me) {
			System.out.print(me.getMessage());
		}	
		catch(InputMismatchException ime) {
			System.out.print(ime.getMessage());
		}
		catch(Exception e) {
			System.out.print(e.getMessage());		
		}
		
	}

}
