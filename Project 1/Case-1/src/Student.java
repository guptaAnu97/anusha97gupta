import java.util.Date;

public class Student {

	private String admissionId;
	private String studentName;
	private String martialStatus;
	private int age;
	private Gender sex;
	private Date dob;
	private String address;
	private String primaryEmail;
	private String secondaryEmail;
	private String phNumber;
	private String subject;
	private String highEduQUa;
	private String nationality;
	private Exam exam;
	private String result;
	private Registrar registrar;
	public String getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getSex() {
		return sex;
	}
	public void setSex(Gender sex) {
		this.sex = sex;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getHighEduQUa() {
		return highEduQUa;
	}
	public void setHighEduQUa(String highEduQUa) {
		this.highEduQUa = highEduQUa;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Registrar getRegistrar() {
		return registrar;
	}
	public void setRegistrar(Registrar registrar) {
		this.registrar = registrar;
	}
	public Student(String studentName, int age, String subject, String martialStatus, String phNumber,
			String primaryEmail, String secondaryEmail, String highEduQUa, String nationality) {
		this.studentName = studentName;
		this.age = age;
		this.subject = subject;
		this.martialStatus = martialStatus;
		this.phNumber = phNumber;
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
		this.highEduQUa = highEduQUa;
		this.nationality = nationality;
	}



	public void registerStudent()  {

		Registrar registar = Registrar.getRegistrar();
		admissionId = registar.registerStudent(this);
		System.out.println("Id: " + admissionId);

	}
	public void registerForExam() {
		ExamRegistrar examRegistrar = ExamRegistrar.getExamregister();
		exam = examRegistrar.registeringStudentForExamination(this);
	}

	public void apperForExam() {
		Paper paper = exam.getPaper();
		result = paper.submit();
	}

	public void display() {
		System.out.println(getStudentName()+" has been registered "+getAdmissionId());
		// TODO Auto-generated method stub
		
	}



}
