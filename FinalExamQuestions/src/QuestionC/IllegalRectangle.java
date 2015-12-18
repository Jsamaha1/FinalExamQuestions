package QuestionC;

public class IllegalRectangle extends Exception {

	// No arg and error Message constructors
	public IllegalRectangle(){};
	
	public IllegalRectangle(String Error) {
		super(Error);
	}

}
