package week3.day2;

public abstract class MySqlConnection implements DatabaseConnection {

	public void connect()
	{
		System.out.println("This is a abstract class connect method");
	}
	
	public void disconnect()
	{
		System.out.println("This is a abstract class disonnect method");
	}
	
	public void executeUpdate()
	{
		System.out.println("This is a abstract class executeUpdate method");
	}
	
	public void executeQuery()
	{
		System.out.println("This is a abstract class executeQuery method");
	}
}
