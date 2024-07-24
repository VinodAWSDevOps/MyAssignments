package challenge;

import java.util.Scanner;

public class SecondChallenge {

	public static void main(String[] args) 
	{
		System.out.print("Enter any number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		System.out.println("The Square root of "+num+" is : "+sqareroot(num));
	}

	public static int sqareroot(int n) 
	{
		double temp;
		double sr = n/2;
		do
		{
			temp=sr;
			sr=(temp+(n/temp))/2;
		} while((temp-sr)!=0);
		int srt = (int)Math.round(sr);
		return srt;
	}
}
