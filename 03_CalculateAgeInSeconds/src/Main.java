import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		try {
			System.out.println("Programming Challenge - 03 - Calculate age in second");
					
			Scanner scanner = new Scanner(System.in);
			short age = 0;
			
			System.out.println("Type your age");
			
			age = scanner.nextShort();
			
			System.out.print("Your age: ");
			System.out.print(age);
			System.out.print(" is ");
		
			scanner.close();
		}
		catch(InputMismatchException ime) {
			System.out.print(ime.getMessage());
		}
		catch(Exception e) {
			System.out.print(e.getMessage());		
		}
	}
}
