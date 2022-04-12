package FactoryDesignPattern;

public abstract class Vehicle {
	public abstract int getWheel();

	@Override
	public String toString() {
		return "Vehicle wheels are "+getWheel();
	}
	
}
class Car extends Vehicle{
	int wheel;
	Car(int wheel){
		this.wheel=wheel;
	}
	@Override
	public int getWheel() {
		
		return wheel;
	}
	
}

class Bike extends Vehicle{
	int wheel;
	Bike(int wheel){
		this.wheel=wheel;
	}
	@Override
	public int getWheel() {
		
		return wheel;
	}
	
}

class VehicleFactory{
	public static Vehicle getInstance(String type,int wheel) {
		if(type.equals("car")) {
			return new Car(wheel);
		}else {
			if(type.equals("bike")) {
				return new Bike(wheel);
			}
		}
		return null;
	}
}

class FactoryPatternExample{
	public static void main(String[] args) {
		Vehicle car=VehicleFactory.getInstance("car", 4);
		System.out.println(car);
		
		Vehicle bike=VehicleFactory.getInstance("bike", 2);
		System.out.println(bike);
	}
}