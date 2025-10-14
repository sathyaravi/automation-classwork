package week3day2;



public class SafariClass extends EdgeClass{

	public void readmode() {
		System.out.println("Inside REad mode");
	}
	
	public void fullScreenMode() {
		System.out.println("Full Screen Mode");
	}
	
	public static void main(String[] args) {
		SafariClass sObj = new SafariClass();
		sObj.clearCookies();
		sObj.fullScreenMode();
		System.out.println("BrowserName:"+sObj.browserName);
		System.out.println("BrowserVersion:"+sObj.browserVersion);

	}

}
