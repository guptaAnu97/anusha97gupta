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
	switch (subjectId) {
	case 1: setInterestedSubject("Maths");
	break;
	
	case 2: setInterestedSubject("Science");
	break;
	
	case 3: setInterestedSubject("Social");
	}
	return interestedSubject;
}
}
