package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) throws IllegalRectangle{
		super(newx, newy);
		if(newx <= 0 || newy <= 0) {
			throw new IllegalRectangle("Invalid Dimensions");
		}
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
