package decoratorpattern;

public class VegetableCurry extends CurryDecorator {
	VegetableCurry(Curry c){
		super(c);
	}
	
	@Override
	public void makeCurry() {
		super.makeCurry();
		System.out.println("Add beans, carrot, corn, awesome veggies to this");
	}
}
