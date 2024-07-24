package challenge;

public class Palindrome {

	public static void main(String[] args) {
		
		String original_str="race a car", reverse_str="";
		int length = original_str.length();
		for (int i=length-1;i>=0; i--)
		{
			reverse_str=reverse_str+original_str.charAt(i);
		}
		String originalStr_modification = original_str.replaceAll(" ","").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println("------Challenge 3------");
		System.out.println("The Original string is : "+original_str);
		String rev_str = reverse_str.replaceAll("\\s", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println("After reversing the string  : "+ rev_str);
		if(originalStr_modification.equals(rev_str))
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not palindrome");
	}
}


