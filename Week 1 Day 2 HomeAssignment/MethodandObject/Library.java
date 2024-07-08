package week1.day2;

public class Library {

	public static void main(String[] args) {
		// Creating an object for Library Class
		Library lib = new Library();
		//Calling addBook method with string parameter
		String bktitle = lib.addBook("Wings of Fire");
		//Printing the book Title
		System.out.println(bktitle);
		//Calling issueBook method
		lib.issueBook();
	}

	//Creating a method with String return type with one parameter
	public String addBook(String bookTitle)
	{
		//Printing the text
		System.out.println("Book Added Successfully ");
		return bookTitle;
	}

	//Creating a method of issueBook
	public void issueBook()
	{
		//Printing the text
		System.out.println("Book Issued Successfully");
	}
}
