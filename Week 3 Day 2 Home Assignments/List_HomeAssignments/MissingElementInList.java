package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissingElementInList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		System.out.println("The Arraylist are as follows : "+arraylist);
        Collections.sort(arraylist);
        System.out.println("Arraylist after sorting is : "+arraylist);
        int missing_number_list = -1;
        for (int i = 0; i < arraylist.size(); i++) {
        	if (arraylist.get(i) !=i+1) {
				missing_number_list=i+1;
				System.out.println(missing_number_list);
				
			}
			
		}
	}

}
