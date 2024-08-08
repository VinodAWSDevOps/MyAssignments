package challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

	public static void main(String[] args) {

		int nums[]= {1,2,3,1};
		int k =3;
		System.out.println("========================================");
		System.out.println("   Challenge 8 - Contains Duplicate 2");
		System.out.println("========================================");
		System.out.println("Entered array of number's are : "+Arrays.toString(nums));
		System.out.println(containsDuplicate(nums, k));
	}

	public static boolean containsDuplicate(int[] nums, int k)
	{
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i =0;i<nums.length;i++)
		{
			if(!hm.containsKey(nums[i]))
			{
				hm.put(nums[i],i);
			}
			else
			{
				int pastIndex=hm.get(nums[i]);
				if(Math.abs(pastIndex-i)<=k)
				{
					return true;
				}
				else
				{
					hm.put(nums[i], i);
				}
			}
		}
		return false;
	}
}
