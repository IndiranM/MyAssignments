package week1.day1;

public class LearnSwitchCase {
	public static void main(String[] args) {
		
		String browserName="Chrome";
		
		switch (browserName) {
		case "Chrome":
			System.out.println("Open chrome browser");
			break;
		case "Edge":
			System.out.println("Open Edge browser");
			break;
		case "Firefox":
			System.out.println("Open Firefox browser");
			break;
		default:
			System.out.println("Open default browser");
			break;
		}
	}

}
