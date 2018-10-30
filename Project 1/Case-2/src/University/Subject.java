package University;

public class Subject {
private int subjectId;
private String interestedSubject;


public String getInterestedSubject() {
	return interestedSubject;
}

public void setInterestedSubject(String interestedSubject) {
	this.interestedSubject = interestedSubject;
}

public int getSubjectId() {
	return subjectId;
}

public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}

public String SubjectName(int subjectID) {
	switch (subjectID) {
	case 1: setInterestedSubject("Maths");
	break;
	
	case 2: setInterestedSubject("Science");
	break;
	
	case 3: setInterestedSubject("Social");
	}
	return interestedSubject;
}
}
