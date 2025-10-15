package week3day3;

public class RemoteWebDriverConcreteClass implements WebDriver {
	
	

	public static void main(String[] args) {
		RemoteWebDriverConcreteClass obj = new RemoteWebDriverConcreteClass();
		obj.findElement();
		obj.clicked();

	}

	@Override
	public void findElement() {
		
			System.out.println("Find Element");
		
	}

	@Override
	public void clicked() {
		
		System.out.println("Clicked message");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		WebDriver.super.click();
	}

}
