package DecoratorDesignPattern;
//call other combined objects 
interface Dress{
	void assemble();
}
class BasicDress implements Dress{
	public void assemble() {
		System.out.println("Basic Dress Features");
	}
}

class DressDecorator implements Dress{
	protected Dress dress;
	public DressDecorator(Dress d) {
		this.dress=d;
	}
	@Override
	public void assemble() {
		this.dress.assemble();
		
	}
	
}
class Fancydress extends DressDecorator{

	public Fancydress(Dress d) {
		super(d);
	}
	@Override
	public void assemble() {
		System.out.println("Fancydress Dress Features");
		
	}
}
class Casualdress extends DressDecorator{

	public Casualdress(Dress d) {
		super(d);
	}
	@Override
	public void assemble() {
		System.out.println("Casualdress Dress Features");
		
	}
}
class Sportydress extends DressDecorator{

	public Sportydress(Dress d) {
		super(d);
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Sportydress Dress Features");
		
	}
}
public class DecoratorDesignPattern {
	public static void main(String[] args) {
		Dress Sportydress =new Sportydress(new BasicDress());	
		Sportydress.assemble();
		
	}
}
