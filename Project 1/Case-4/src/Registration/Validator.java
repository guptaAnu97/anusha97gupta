package Registration;
import University.Student;
import universityException.AgeException;

public class Validator {
	private static Validator singletonObj;

	private Validator(){
	}
	static Validator getValidator() {
		if(singletonObj==null)
		return new Validator();
		else
			return singletonObj;
	}
	
	public boolean validateStudentDetails(Student student) throws AgeException{
		if (student.getStudentName() != null) {
			if(student.getAge()<23 || student.getAge()>35)
				throw new AgeException("Age must be higher than 23 and lower than 35");
			return true;
		}

		return false;
	}
}


	
	


