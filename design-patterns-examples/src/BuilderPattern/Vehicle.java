package BuilderPattern;

public class Vehicle {
	
	private int numberplate;
	private int airbags;
	private String color;
	
	public Vehicle(VehicleBuilder vb) {
		this.numberplate=vb.getNumberplate();
		this.airbags=vb.getAirbags();
		this.color=vb.getColor();
	}

	public int getNumberplate() {
		return numberplate;
	}

	public int getAirbags() {
		return airbags;
	}

	public String getColor() {
		return color;
	}
	

}
class VehicleBuilder{
	private int numberplate;
	private String color;
	private int airbags;
	
	public VehicleBuilder(int numberplate,int airbags) {
		this.airbags=airbags;
		this.numberplate=numberplate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberplate() {
		return numberplate;
	}

	public int getAirbags() {
		return airbags;
	}
	
}

class TestThis{
	public static void main(String[] args) {
		VehicleBuilder vb=new VehicleBuilder(4102, 2);
		
		Vehicle v=new Vehicle(vb);
		System.out.println(v.getColor()+" "+v.getNumberplate());
		vb.setColor("Red");
		Vehicle v1=new Vehicle(vb);
		System.out.println(v1.getColor()+" "+v1.getNumberplate());
	}
}