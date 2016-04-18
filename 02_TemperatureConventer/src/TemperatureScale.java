
public enum TemperatureScale {
	CELSIUS,
	FAHRENHEIT,
	KELVIN;	
	
	public String toString(){
        switch(this){
        case CELSIUS :
            return "Celsius";
        case FAHRENHEIT :
            return "Fahrenheit";
        case KELVIN :
            return "Kelvin";
        }
        return null;
    }
}
