package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int num,t,r,rev;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number to check : ");
		num=sc.nextInt();
		t=num;
		for(rev=0;t!=0;t=t/10)
		{
			r=t%10;
			rev=(rev*10)+r;
		}
		System.out.println("Reverse of entered number is : "+rev);
		if(num==rev)
		{
			System.out.println("Entered number "+num+ " is a palindrome");	
		}
		else
		{
			System.out.println("Entered number is NOT a palindrome");
		}
	}

}
