package decoratorpattern;

public class MyChef {

	public static void main(String[] args) {
		//BasicCurry basicMeal = new BasicCurry(); 
		//basicMeal.makeCurry();
		
		//VegetableCurry vegMeal = new VegetableCurry(new BasicCurry());
		//vegMeal.makeCurry();
		
		Curry chickenVeggieMeal = new ChickenCurry(new VegetableCurry(new BasicCurry()));
		chickenVeggieMeal.makeCurry();
	}

}
