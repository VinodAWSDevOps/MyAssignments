package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String allWords[];
		String result = "";
		int count = 0;
		allWords=text.split(" ");
		for (int i = 0; i < allWords.length; i++) 
		{
			for (int j = i+1; j < allWords.length; j++) 
			{
				if(allWords[i].equalsIgnoreCase(allWords[j]))
				{
					allWords[j]=" ";
					count = count+1;

				}
			}
		}
		for (String word : allWords)
		{
			if(word !=" ")
			{
				result = result + word +" ";
			}
			else
				result = result + " ";
		}
		System.out.println("------Remove Duplicate words in String using for loop------");
		System.out.println(text);
		System.out.println(result);
	}
}
