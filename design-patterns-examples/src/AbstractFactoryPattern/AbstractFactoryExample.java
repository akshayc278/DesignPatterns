package AbstractFactoryPattern;

public class AbstractFactoryExample {

}

interface PizzaIngFactory {
	public Dough createDough(Dough dough, String st);

	public Toppings createToppings();
}

class MakePizza implements PizzaIngFactory {

	@Override
	public Dough createDough(Dough dough, String st) {
		//Factory pattern is this //getting object depending on coming parent object instance
		if (st.equalsIgnoreCase("color")) {
			return new Color();
		} else {
			return new Pizza();
		}
	}

	@Override
	public Toppings createToppings() {
		//just plain interface which is abstract and providing respective class object as output is abstract factory
		//You can use Interface name while calling this method 
		return new Toppings();
	}

}
//Arrangement for Factory method 
class Color extends Dough {
	public void printColor() {
		System.out.println("this is color class");
	}
}
//Arrangement for Factory method
class Pizza extends Dough {
	public void printPizza() {
		System.out.println("this is pizza class");
	}
}


class Dough {
	public void printDough() {
		System.out.println("this is Dough class");
	}
}
//abstract factory method
class Toppings {
	public void printToppings() {
		System.out.println("this is Toppings class");
	}
}