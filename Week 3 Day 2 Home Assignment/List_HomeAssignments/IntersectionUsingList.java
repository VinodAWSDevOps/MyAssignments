package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionUsingList {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist1 = new ArrayList<>(Arrays.asList(3, 2, 11, 4, 6, 7));
		ArrayList<Integer> arraylist2 = new ArrayList<>(Arrays.asList(1, 2, 8, 4, 9, 7));
		System.out.println("------Intersection Using List------");
		System.out.println("This First array list are : "+arraylist1);
		System.out.println("The Second array list are : "+arraylist2);
		for (int i = 0; i < arraylist2.size(); i++) 
		{
			if(arraylist1.contains(arraylist2.get(i)))
			{
				System.out.println("These are intersection numbers : "+arraylist1.get(i));
			}

		}

	}

}

