
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
	
	public boolean validateStudentDetails(Student student){
		if (student.getStudentName() != null) {
			if(student.getAge()>23 && student.getAge()<35)
				System.out.println("Validated");
			return true;
		}

		return false;
	}
}


	
	


