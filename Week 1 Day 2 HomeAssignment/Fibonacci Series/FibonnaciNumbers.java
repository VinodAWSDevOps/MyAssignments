package week1.day2;

public class FibonnaciNumbers {

	public static void main(String[] args) {
		//Initializing n1,n2 and count variables
		int n1=0,n2=1,n3,i,count=5;
		//Printing the Input text
		System.out.println("The Fibonacci numbers between the range " +count+ " are");
		//Printing the first two numbers
		System.out.print(n1+" "+n2);
		//Iterating 8 times to find the fibonacci series of range 8
		for(i=2;i<count;i++)
		{
			//Calculating the n3 value by summing up n1 and n2
			n3=n1+n2;
			//Printing the result of n3 value
			System.out.print(" "+n3+" ");
			//Assigning the n2 value to n1
			n1=n2;
			//Assigning the n3 value to n2
			n2=n3;

		}

	}

}
