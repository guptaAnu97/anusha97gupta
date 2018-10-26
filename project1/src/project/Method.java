package project;
import java.util.Scanner;
class Method{
	
	public static void main(String[] args) {
		String sh = "Short";
		String yorker ="Yorker";
		String good ="Good";
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
	while(true) {
	if (input.equals("Full")) {
		System.out.println("Yes");
	}
	if ( input == sh ) {
		System.out.println("no");
	}
	if (input == good) {
		System.out.println("no");
	}
	if (input == yorker) {
		System.out.println("no");
	}
	else {
		System.out.println("Invalid");
		break;
	}
	
}
}
}
