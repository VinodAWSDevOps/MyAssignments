package challenge;

import java.util.Arrays;
import java.util.HashSet;

public class SeventhChallenge_NumAppearsTwice {

	public static void main(String[] args) 
	{
		int[] dupNumbers = {1,2,3,1};
		System.out.println("===================================================");
		System.out.println("   Challenge 7 - Number Appear Twice in an Array");
		System.out.println("===================================================");
		System.out.println("The entered array of numbers are : "+Arrays.toString(dupNumbers));
		System.out.println(isNumberAppearTwice(dupNumbers));
	}
	
	public static boolean isNumberAppearTwice(int[] dupNumbers)
	{
		HashSet<Integer> numbers = new HashSet<>();
		for (int i=0;i<dupNumbers.length;i++)
		{
			if(numbers.contains(dupNumbers[i]))
				return true;
			numbers.add(dupNumbers[i]);
		}
		return false;
	}
}
