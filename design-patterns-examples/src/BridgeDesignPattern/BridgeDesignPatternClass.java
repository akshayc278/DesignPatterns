package BridgeDesignPattern;

abstract class TV{
	Remote remote;
	TV(Remote r){
		this.remote=r;
	}
	abstract void on();
	abstract void off();
}

class Sony extends TV{
	Remote remoteType;
	Sony(Remote r) {
		super(r);
		this.remoteType=r;
	}
	@Override
	void on() {
		System.out.println("sony tv is on");
		remoteType.on();
		
	}
	@Override
	void off() {
		System.out.println("sony tv is off");
		remoteType.off();
		
	}
	
}
class Philip extends TV{
	Remote remoteType;
	Philip(Remote r) {
		super(r);
		this.remoteType=r;
	}
	@Override
	void on() {
		System.out.println("philip tv is on");
		remoteType.on();
		
	}
	@Override
	void off() {
		System.out.println("philip tv is off");
		remoteType.off();
		
	}
	
}
interface Remote{
	public void on() ;
	public void off();
}

class OldRemote implements Remote{

	@Override
	public void on() {
		System.out.println("on with old remote");
		
	}

	@Override
	public void off() {
		System.out.println("off with old remote");
		
	}
	
}
class NewRemote implements Remote{

	@Override
	public void on() {
		System.out.println("on with new remote");
		
	}

	@Override
	public void off() {
		System.out.println("off with new remote");
		
	}
	
}
public class BridgeDesignPatternClass {
	public static void main(String[] args) {
		TV sonyOldRemote=new Sony(new OldRemote());
		sonyOldRemote.on();
		sonyOldRemote.off();
	}
}
