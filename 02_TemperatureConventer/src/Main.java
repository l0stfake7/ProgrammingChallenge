import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Programming Challenge - 02 - Temperature Conventer");
			System.out.println("Type source scale (Celsius, Fahrenheit or Kelvin)");
			String scaleSource = scanner.next();

			System.out.println("Type destination scale (Celsius, Fahrenheit or Kelvin)");
			String scaleDestination = scanner.next();

			boolean[] isMatch = new boolean[2];
			for(TemperatureScale ts: TemperatureScale.values()) {
				
				if(scaleSource.toUpperCase().equals(ts.toString())) {
					isMatch[0] = true;
					continue;									
				}
				else if(scaleDestination.toUpperCase().equals(ts.toString())) {
					isMatch[1] = true;
					continue;
				}				
			}
			if(isMatch[0] == false || isMatch[1] == false) {
				throw new MyException("Bad chose, available scales(Celsius, Fahrenheit or Kelvin)!");
			}
			if(scaleSource.equals(scaleDestination)) {
				throw new MyException("Bad chose, same scales!");
			}
			
			System.out.println("Type temperature (use \",\" instead \".\")");
			double temperature = scanner.nextDouble();
			
			double convertTemperature = TemperatureConverter.ConverterTemperature(temperature, TemperatureScale.valueOf(scaleSource.toUpperCase()), TemperatureScale.valueOf(scaleDestination.toUpperCase()));
			
			StringBuilder test = new StringBuilder("Temperature ");
			test.append(temperature);
			test.append(" in ");
			test.append(scaleSource);
			test.append(" is ");
			test.append(convertTemperature);
			test.append(" in ");
			test.append(scaleDestination);			
			
			System.out.println(test);
			
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
