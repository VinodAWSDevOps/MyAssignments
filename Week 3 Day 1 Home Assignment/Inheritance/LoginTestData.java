package week3.Day1;

public class LoginTestData extends TestData {

	public void enterUsername()
	{
		System.out.println("This is subclass using enterUsername method");	
	}

	public void enterPassword()
	{
		System.out.println("This is subclass using enterPassword method");
	}
	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		System.out.println("------Example of Single Level Inheritance------");
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterUsername();
		ltd.enterPassword();
	}

}
