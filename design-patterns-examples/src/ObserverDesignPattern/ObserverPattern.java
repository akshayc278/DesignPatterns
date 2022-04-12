package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
	void update(String location);
}
interface Subject{
	void register(Observer obj);
	void unregister(Observer obj);
	void notifyObserver();
}

class DeliveryData implements Subject{
	private List<Observer> observers;
	private String location;
	public DeliveryData() {
		this.observers=new ArrayList<>();
	}
	@Override
	public void register(Observer obj) {
		observers.add(obj);
		
	}
	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);
		
	}
	@Override
	public void notifyObserver() {
		for(Observer obj:observers) {
			obj.update(location);
		}
		
	}
	public void locationChange() {
		this.location=getLocation();
		notifyObserver();
	}
	private String getLocation() {
		// TODO Auto-generated method stub
		return "YPlace";
	}
}
class Seller implements Observer{
	private String location;

	@Override
	public void update(String location) {
		this.location=location;
		showLocation();
		
	}

	private void showLocation() {
		System.out.println("seller "+location);
		
	}
}
class User implements Observer{
	private String location;

	@Override
	public void update(String location) {
		this.location=location;
		showLocation();
		
	}

	private void showLocation() {
		System.out.println("User "+location);
		
	}
}

class Deliverycenter implements Observer{
	private String location;

	@Override
	public void update(String location) {
		this.location=location;
		showLocation();
		
	}

	private void showLocation() {
		System.out.println("warehoues "+location);
		
	}
	
}
public class ObserverPattern {
	public static void main(String[] args) {
		DeliveryData topic =new DeliveryData();
		Observer ob1=new Seller();
		Observer ob2=new User();
		Observer ob3=new Deliverycenter();
		topic.register(ob3);
		topic.register(ob2);
		topic.register(ob1);
		topic.locationChange();
	}
}
