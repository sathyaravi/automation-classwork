package week3day2;

public class BrowserClass {
	
	String browserName = "DefaultBrowser";
	String browserVersion = "1.1.0";
	
	public void openURL() {
		System.out.println("Open URL");

	}
	
	public void closeBrowser() {
		System.out.println("Close the browser");

	}
	
	public void navigateBack() {
		System.out.println("Navigating back to the page");

	}

	public static void main(String[] args) {
		
		BrowserClass newobj = new BrowserClass();
		System.out.println("BrowserName:"+newobj.browserName);
		System.out.println("BrowserVersion:"+newobj.browserVersion);
		
	}

}
