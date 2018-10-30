package Examination;

public class Evaluator {

	private static Evaluator singletonObj;

	private Evaluator() {
		
	}

	public static Evaluator getEvaluator() {
		if (singletonObj == null)
			return new Evaluator();
		else
			return singletonObj;
	}

	

	public String evaluate(Paper paper) {
		// TODO Auto-generated method stub
		return "Pass";
	}
}
