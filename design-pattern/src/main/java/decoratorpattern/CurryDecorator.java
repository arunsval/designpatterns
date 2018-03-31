package decoratorpattern;

public class CurryDecorator implements Curry {
	
	protected Curry curry;
	
	CurryDecorator(Curry curry){
		this.curry = curry;
	}
	public void makeCurry() {
		this.curry.makeCurry();
	}

}
