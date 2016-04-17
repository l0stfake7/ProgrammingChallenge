import java.io.IOException;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programming Challenge - 00 - Name Generator");
		System.out.println("Type char:");
		char a = scanner.next().charAt(0);
		
		System.out.println("Type char:");
		char b = scanner.next().charAt(0);
		
		NameGenerator ng = new NameGenerator(a, b);
		System.out.println(ng.getName());
		
		scanner.close();
	}

}
