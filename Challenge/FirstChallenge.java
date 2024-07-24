package challenge;

import java.util.Scanner;

public class FirstChallenge {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("------This is 1st Challenge------");
		System.out.println("Enter the text : ");
		String last_word_length = s.nextLine();
		String[] word = last_word_length.split("\\s+");
		String last_word = word[word.length-1];
		System.out.println(last_word.length());
	}

}
