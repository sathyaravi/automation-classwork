package week3day2;

public class ChromeClass extends BrowserClass {
	
	public void openIncognito() {
		System.out.println("Incognito Method");

	}
	
	public void clearCache() {
		System.out.println("Clearing Cache");

	}
	public static void main(String[] args) {
		
		ChromeClass chobj = new ChromeClass();
		chobj.openIncognito();
		chobj.navigateBack();
		System.out.println("Browser name from Browser class:"+chobj.browserName);
		
	}

}
