package AdapterDesignPattern;

interface WebDriver{
	public void getElement();
	public void selectElement();
}


class ChromeDriver implements WebDriver{

	@Override
	public void getElement() {
		System.out.println("get element from chromedriver");
		
	}

	@Override
	public void selectElement() {
		System.out.println("select element from chromedriver");
		
	}
	
}

class IEDriver{
	public void findElement() {
		System.out.println("find element from IEdriver");
	}
	public void clickElement() {
		System.out.println("click element from IEdriver");
	}
}
class WebDriverAdaper implements WebDriver{
	IEDriver iEDriver;
	public WebDriverAdaper(IEDriver iEDriver) {
		this.iEDriver=iEDriver;
	}
	
	@Override
	public void getElement() {
		iEDriver.findElement();
	}

	@Override
	public void selectElement() {
		iEDriver.clickElement();
		
	}
	
}
public class AdapterDesignPattern {
	public static void main(String[] args) {
		IEDriver iEDriver=new IEDriver();
		WebDriver webDriverAdaper=new WebDriverAdaper(iEDriver);
		webDriverAdaper.getElement();
		webDriverAdaper.selectElement();
	}
	
}
