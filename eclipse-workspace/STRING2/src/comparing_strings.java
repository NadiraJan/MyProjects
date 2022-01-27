import java.util.Scanner;

public class comparing_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = console.next();
		if (name.equals ("Lance")) {
			System.out.println("Pain is temporary.");
			System.out.println("Quitting lasts forever.");
				}
		
		String name1 = console.next();
		if(name1.endsWith("Kweli")) {
			System.out.println("Pay attention, you gotta listen to hear.");
		} else if(name1.equalsIgnoreCase("NaS")) {
			System.out.println("I never sleep 'cause sleep is the cousin of death.");
		}
		
			
		

	}

}
