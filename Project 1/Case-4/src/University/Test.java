package University;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

import universityException.UniversityException;


public class Test {

	public static void main(String[] args) throws IOException, UniversityException {
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
		
		String str = "Choose the subject you want to opt for \n 1.Maths \n 2.Social \n 3.Science \n Enter the number";
		System.out.println(str);
		int n = Integer.parseInt(br.readLine());
		
		
		
		Student std = new Student(name, age, n , martialStatus, null, email, null, qualification, nationality);
	
		*/
		try {
		Student std1 =new Student("manu", 27, 2, "Unmarried", "0909", "NULL", "NULL", "Btech", "Indian");
		Student std2 =new Student("manu1", 30, 1, "Unmarried", "0909", "NULL", "NULL", "Btech", "Indian");
	
		std1.registerForExam();
		std1.apperForExam();
		std1.registerStudent();
		std1.display();
		std2.registerForExam();
		std2.apperForExam();
		std2.registerStudent();
		std2.display();
	}catch(Exception e ){
		
		System.out.println(e);
	}
	}
	
	
}
