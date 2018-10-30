package University;

public class Subject {
private int subjectId;
private String interestedSubject;


public String getInterestedSubject() {
	return interestedSubject;
}

public String setInterestedSubject(String interestedSubject) {
	return this.interestedSubject = interestedSubject;
}

public int getSubjectId() {
	return subjectId;
}





public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}


public String interestedSubject(int subjectId) {
	String subject =null;
	if(subjectId==1) {
		subject = setInterestedSubject("Maths");
		
	}
	if(subjectId==2) {
		subject =setInterestedSubject("Social");
	}
	if(subjectId==3) {
		subject =setInterestedSubject("Science");
	}
	return subject;
}
}
