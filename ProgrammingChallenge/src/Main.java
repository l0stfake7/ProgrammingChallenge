
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World");
		Name n1 = new Name("Bartek");
		System.out.println(n1.getName());
		
		MyRandom rand1 = new RandomBuilder()
			.rangeMax(1000)
			.rangeMin(90)
			.charBegin('a')
			.charEnd('e')
			.buildRandom();
		int x = 0;
		while(x < 10) {
			int testval = rand1.getInt();
			System.out.println(testval);
			x++;
		}
		
		x = 0;
		while(x < 10) {
			char testval = rand1.getChar();
			System.out.println(testval);
			x++;
		}
	}

}
