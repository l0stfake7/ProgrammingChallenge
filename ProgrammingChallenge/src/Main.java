
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World");
		Name n1 = new Name("Bartek");
		System.out.println(n1.getName());
		
		MyRandom rand1 = new RandomBuilder()/*.rangeMax(1000)
				*/.rangeMin(90)
				.buildRandom();
		int x = 0;
		while(x < 10) {
			int testval = rand1.getInt();
			System.out.println(testval);
			x++;
		}
	}

}
