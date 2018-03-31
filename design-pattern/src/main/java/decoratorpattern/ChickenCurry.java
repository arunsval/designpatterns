package decoratorpattern;

public class ChickenCurry extends CurryDecorator {
	ChickenCurry(Curry c){
		super(c);
	}
	
	@Override
	public void makeCurry() {
		super.makeCurry();
		System.out.println("Add fresh chicken pieces and add more spicies");
	}
}
