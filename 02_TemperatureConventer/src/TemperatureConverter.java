
public class TemperatureConverter {
	
	public static double ConverterTemperature(double temperature, TemperatureScale sourceScale, TemperatureScale destinationScale) {
				
		double resultTemperature = 0.0;
		if(sourceScale.equals(TemperatureScale.CELSIUS)) {
			if(destinationScale.equals(TemperatureScale.FAHRENHEIT)) {
				resultTemperature = (temperature * 1.8) + 32.0;
			}
			else if(destinationScale.equals(TemperatureScale.KELVIN)) {
				resultTemperature = temperature + 273.15;
			}
		}
		else if(sourceScale.equals(TemperatureScale.FAHRENHEIT)) {
			if(destinationScale.equals(TemperatureScale.CELSIUS)) {
				resultTemperature = (temperature - 32) / 1.8;
			}
			else if(destinationScale.equals(TemperatureScale.KELVIN)) {
				resultTemperature = (temperature + 459.67) * (5/9);
			}
		}
		else if(sourceScale.equals(TemperatureScale.KELVIN)) {
			if(destinationScale.equals(TemperatureScale.CELSIUS)) {
				resultTemperature = temperature - 273.15;
			}
			else if(destinationScale.equals(TemperatureScale.FAHRENHEIT)) {
				resultTemperature = (temperature * 1.8) - 459.67;
			}
		}
		return resultTemperature;
	}
}
