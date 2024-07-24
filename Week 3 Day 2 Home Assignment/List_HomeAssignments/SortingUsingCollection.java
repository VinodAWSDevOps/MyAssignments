package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("HCL");
		str.add("Wipro");
		str.add("Aspire Systems");
		str.add("CTS");
		System.out.println("The original ArrayList is : "+str);
		Collections.sort(str);
		System.out.println("The ArrayList after sorting is : "+str);
		Collections.reverse(str);
		System.out.println("The Reverse of String using Collection is : "+str);
	}

}
