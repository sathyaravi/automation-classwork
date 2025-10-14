package week2day1;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Firefox";
		switch (browserName) {
		case "chrome":
			System.out.println("The Current Script is executing in Chrome");
			break;
		case "Edge":
			System.out.println("The Current Script is executing in Edge");
			break;
		case "Firefox":
			System.out.println("The Current Script is executing in Firefox");
			break;

		default:
			System.out.println("please enter valid browser name");
			break;
		}

	}

}
