import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Programming Challenge - 01 - Higher/Lower, Heads/Tails");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type first value");
		int a = scanner.next().charAt(0);
		
		System.out.println("Type second value");
		int b = scanner.next().charAt(0);
		
		switch(Comparator.compare(a, b)) {
			case 1: {
				System.out.println("First value is higher than second value");
				break;
			}
			case 2:{
				System.out.println("First value is lower than second value");
				break;
			}
			case 3:{
				System.out.println("First value is the same as second value");
				break;
			}
		}		
		
		scanner.close();
	}

}
