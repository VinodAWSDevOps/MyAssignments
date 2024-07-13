package week3.day2;

public class JavaConnectionAbstract extends MySqlConnection{

	public static void main(String[] args) {
		
		JavaConnectionAbstract jca = new JavaConnectionAbstract();
		jca.connect();
		jca.disconnect();
		jca.executeQuery();
		jca.executeUpdate();

	}

}
