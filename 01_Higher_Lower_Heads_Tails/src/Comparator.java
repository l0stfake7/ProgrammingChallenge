
public class Comparator {
		
	public static short compare(int valueA, int valueB) {
		if(valueA > valueB)
			return 1;
		else if(valueA < valueB)
			return 2;
		else
			return 3;
	}
	
	public static short compare(float valueA, float valueB) {
		if(valueA > valueB)
			return 1;
		else if(valueA < valueB)
			return 2;
		else
			return 3;
		
	}

	public static short compare(double valueA, double valueB) {
		if(valueA > valueB)
			return 1;
		else if(valueA < valueB)
			return 2;
		else
			return 3;
	
	}

	public static short compare(long valueA, long valueB) {
		if(valueA > valueB)
			return 1;
		else if(valueA < valueB)
			return 2;
		else
			return 3;
	
	}
}
