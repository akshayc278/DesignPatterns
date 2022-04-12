package FacadeDesignPattern;
//separate logic if interface has lot of method with same purpose //here firfox and chrome have functionality so we sepated it from interface

class Firefox {

	public static void generateReport(String test, String driver) {
		System.out.println(test + " Generating reports for Firefox");

	}

}

class Chrome {

	public static void generateReport(String test, String driver) {
		System.out.println(test + " Generating reports for Firefox");

	}

}

class FacadeHelper {
	public void generate(String test, String driver) {
		switch (test) {
		case "firefox":
			Firefox.generateReport("firefox", driver);
			break;
		case "chrome":
			Chrome.generateReport("chrome", driver);
			break;
		default:
			System.out.println("provide valid input");
		}

	}
}

public class FacadeDesignPattern {
	public static void main(String[] args) {
		FacadeHelper fh = new FacadeHelper();
		fh.generate("firefox", "driver1");

	}
}
