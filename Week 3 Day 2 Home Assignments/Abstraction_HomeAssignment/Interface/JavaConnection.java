package week3.day2;

public class JavaConnection implements DatabaseConnection {

	public void connect()
	{
		System.out.println("This is connect method in a concrete class");
	}
	
	public void disconnect()
	{
		System.out.println("This is a disconnect method in a concrete class");
	}
	
	public void executeUpdate()
	{
		System.out.println("This is a executeUpdate method in a concrete class");
	}

public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
}
}
