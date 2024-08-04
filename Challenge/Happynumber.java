package challenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Happynumber {

	public static void main(String[] args) {
		
		System.out.println("=============================");
		System.out.println("   Challenge 5-HappyNumber");
		System.out.println("=============================");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		System.out.println(isHappyNumber(n));
	}
	
	public static boolean isHappyNumber(int num)
	{
		
		Set<Integer> seti = new HashSet<>();
		while(!seti.contains(num))
		{
			seti.add(num);
			int sum=0;
			while(num!=0)
			{
				int temp = num%10;
				sum=sum+(temp*temp);
				num=num/10;
			}
			num=sum;
		}
			return num==1;
	}
}
