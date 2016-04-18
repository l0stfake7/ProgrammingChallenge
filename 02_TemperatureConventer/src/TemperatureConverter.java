
public class TemperatureConverter {
	
	public static StringBuilder ConverterTemperature(float temperature, TemperatureScale sourceScale, TemperatureScale destinationScale) {
		StringBuilder test = new StringBuilder("");
		test.append(temperature);
		test.append(" ");
		test.append(sourceScale);
		test.append(" ");
		test.append(destinationScale);
		return test;
	}
}
