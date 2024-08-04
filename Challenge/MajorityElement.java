package challenge;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) 
	{
		int nums[]= {2,2,1,1,1,2,2};
		System.out.println("====================================");
		System.out.println("   Challenge 6 - Majority Element");
		System.out.println("====================================");
		System.out.println("The given array of number's are : "+Arrays.toString(nums));
		System.out.println("The Majority Element of an array is : "+majorityElement(nums));
	}

	public static int majorityElement(int[] nums)
	{
		int candidate =0;
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(count==0)
			{
				candidate = nums[i];
			}
			if(candidate==nums[i])
			{
				count++;
			}
			else
			{
				count--;
			}
		}
		return candidate;
	}
}
