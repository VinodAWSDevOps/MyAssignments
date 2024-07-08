package week3.Day1;

public class APIClient {

	public static void main(String[] args) {
		APIClient ac = new APIClient();
		ac.sendRequest("HTTPS");
		ac.sendRequest("https", "Text", true);

	}

	public void sendRequest(String endpoint)
	{
		System.out.println("This is example for single parameter method overloading");
		System.out.println("Endpoint is "+endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus)
	{
		System.out.println("This is multiple parameter method overloading");
		System.out.println("Endpoint "+endpoint+" request body"+requestBody+" status checking "+requestStatus);
	}
}
