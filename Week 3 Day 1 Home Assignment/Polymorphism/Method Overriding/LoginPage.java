package week3.Day1;

public class LoginPage extends BasePage{

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.performCommonTasks("Clicked");
	}
	
	@Override
	public void performCommonTasks(String s5)
	{
		System.out.println("This is method overriding : "+s5);
	}
}
