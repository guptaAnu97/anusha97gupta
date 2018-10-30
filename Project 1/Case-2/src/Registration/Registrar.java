package Registration;
import University.Student;
public class Registrar {
	static int lastID = 1;

	private static Registrar singletonObj;
	private Registrar(){

	}

	public static Registrar getRegister() {
		if (singletonObj == null)
			return new Registrar();
		else
			return singletonObj;
	}


	public String registerStudent(Student student){
		String admissionId=null;
		int I=0;
		Validator validator=Validator.getValidator();
		if(validator. validateStudentDetails (student))
		{

			admissionId = "ABC" + String.format("%05d", lastID);
			lastID =  lastID+1;
			student.setAdmissionId(admissionId);
			System.out.println(student.getStudentName() + " registered");
		}

		return admissionId;
	}



	public static Registrar getRegistrar() {
		// TODO Auto-generated method stub
		return new Registrar();
	}
}


