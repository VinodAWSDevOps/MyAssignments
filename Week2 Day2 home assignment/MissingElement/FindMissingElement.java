package week2.day2.assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] input_array = {1,4,3,2,8,6,7};

		Arrays.sort(input_array);
		int missingNumber = -1;
		for (int index = 0; index < input_array.length; index++) {
			if(input_array[index]!=index+1)
			{
				missingNumber=index+1;
				System.out.println("The missing Number is : "+missingNumber);
				break;
			}
		}

	}

}
