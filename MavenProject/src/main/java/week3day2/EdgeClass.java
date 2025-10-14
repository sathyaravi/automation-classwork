package week3day2;

public class EdgeClass extends ChromeClass{
	
	public void takeSnap() {
		System.out.println("Taking Snap");

	}
	
	public  void clearCookies() {
		System.out.println("Clear the cookies");

	}

	public static void main(String[] args) {
		
		EdgeClass edObj = new EdgeClass();
		edObj.openIncognito();
		edObj.takeSnap();
		edObj.navigateBack();

	}

}
