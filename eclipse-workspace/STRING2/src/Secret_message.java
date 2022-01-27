import java.util.Scanner;

public class Secret_message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		System.out.print("Your secret message: ");
		String message = console.nextLine();
		message = message.toLowerCase;
		System.out.print("Your secret key: ");
		int key = console.nextInt();
		encode(message, key);
	}

}
