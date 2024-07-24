package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumberInList {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(3, 2, 11, 4, 6, 7));
		System.out.println("The ArrayList are as follows : "+arraylist);
		Collections.sort(arraylist);
		System.out.println("The ArrayList after sorting : "+arraylist);
		int second_largestnumber = arraylist.get(arraylist.size()-2);
		System.out.println("The Second larget number in ArrayList is : "+second_largestnumber);			
	}
}
