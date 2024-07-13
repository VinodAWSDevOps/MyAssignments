package week3.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		String test = "changeme";

		char[] charArray  = test.toCharArray();
		for (int i = 1;i<charArray.length;i=i+2)
		{
			charArray[i]=Character.toUpperCase(charArray[i]);
		}
		System.out.println("------The ChangeOddIndexToUppercase are-------");
		System.out.println(charArray);

	}

}
