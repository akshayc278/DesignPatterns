package PrototypePattern;

public class Vehicle implements Cloneable {

	private int numberPlate;
	private String nameOfCar;

	public int getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(int numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}
	
	public Object Clone() {
		return new Vehicle();
	}
	
}

class TestClass{
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.setNameOfCar("Skoda");
		v1.setNumberPlate(4120);
		Vehicle v2=(Vehicle) v1.Clone();
		v2.setNameOfCar("BMW");
		System.out.println(v2.getNameOfCar());
		System.out.println(v1.getNameOfCar());
	}
	
}
