package week3.day2;

public class ReverseOddWordsString {

	public static void main(String[] args) {
		String str = "I am a software tester";
		System.out.println(str);
		String[] split = str.split(" ");
		String result = "";
		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				char[] charArray = split[i].toCharArray();
				String re="";
				for (int j = charArray.length - 1; j >= 0; j--) {
					re =re+ Character.toString(charArray[j]);
				}
				result=result+re;
			} else {
				result=result+" "+split[i]+" ";
			}
		}
		System.out.println(result);
	}
}

