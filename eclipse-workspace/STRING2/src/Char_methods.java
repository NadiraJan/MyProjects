import java.util.Scanner;

public class Char_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String food = "cookie";
		char firstLetter = food.charAt(0);
		System.out.println(firstLetter   + " is for for " + food);
		System.out.println("That's good enough for me!");
		
		String major = "CSE";
		for (int i=0; i < major.length(); i++) {
			char c = major.charAt(i);
			System.out.println(c);
		}

	//String is an object; it contains methods
		String s = "h";
		s= s.toUpperCase();
		int len = s.length();
		char first = s.charAt(0);
		
	//char is primitive; you can't call methods on it
		
		/*char b='h';
		B = b.toUpperCase();*/
		
		
	}

}
