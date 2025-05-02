package week1.day2;

public class Library {

	public String addBook(String bookTitle) {
		return bookTitle;
	}
	
	
	public void issueBook() {
		System.out.println("Book issued Successfully");
	}
	
	public static void main(String[] args) {
		Library ln=new Library();
			System.out.println(ln.addBook("Book added Successfully"));	
			ln.issueBook();
	}
	
	
	}
	
