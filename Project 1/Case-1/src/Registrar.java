
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
		String addmissionId=null;
		Validator validator=Validator.getValidator();
		if(validator. validateStudentDetails (student))
		{
		addmissionId = "ABC" + String.format("%05d", lastID);
		lastID =  lastID+1;
		student.setAdmissionId(addmissionId);
		System.out.println(student.getStudentName() + " registered");
		}

		return addmissionId;
	}



	public static Registrar getRegistrar() {
		// TODO Auto-generated method stub
		return new Registrar();
	}
}


