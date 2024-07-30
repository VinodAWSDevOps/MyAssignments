package challenge;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[]= {2,2,1};
		System.out.println("=================================================");
		System.out.println("     Challenge 4 : Single Number in an Array     ");
		System.out.println("=================================================");
		System.out.println("The Given array of number's : "+Arrays.toString(nums));
		System.out.println("The Single number is : " +singleNumber(nums));
	}

	public static int singleNumber(int nums[])
	{
		int value=0;
		for (int i = 0; i < nums.length; i++) {
			value=value^nums[i];
		}
		return value;
	}
}
