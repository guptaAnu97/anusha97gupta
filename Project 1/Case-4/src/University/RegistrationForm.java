package University;

import java.util.Date;

public class RegistrationForm {

	private String studentName;
	private String martialStatus;
	private int age;
	private Gender sex;
	private Date dob;
	private String address;
	private String primaryEmail;
	private String secondaryEmail;
	private String phNumber;
	private Subject interestedSubject;
	private String highEduQUa;
	private String nationality;

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

	public Subject getInterestedSubject() {
		return interestedSubject;
	}

	public void setInterestedSubject(Subject interestedSubject) {
		this.interestedSubject = interestedSubject;
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
}

