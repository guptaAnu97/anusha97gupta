package University;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter marital status");
		String martialStatus = br.readLine();
		System.out.println("Enter email");
		String email = br.readLine();
		System.out.println("Enter highest qualification");
		String qualification = br.readLine();
		System.out.println("ENter nationality");
		String nationality = br.readLine();
		
		String str = "Choose the sbuject you want to opt for \n 1.Maths \n 2.Science \n 3.Social \n Enter the number";
		System.out.println(str);
		int n = Integer.parseInt(br.readLine());
		
		
		Student std = new Student(name, age, n , martialStatus, null, email, null, qualification, nationality);
	
		std.registerForExam();
		std.apperForExam();
		std.registerStudent();
		std.display();
	}
	
	
}
