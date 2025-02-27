package lab06;

public class Book {
	//Attribute
	protected String title;
	protected String publisher;
	//Constructor
	public Book() {
		System.out.println("Title cannot be empty.");
		System.out.println("Publisher cannot be empty.");
		this.title = "unknown title";
		this.publisher = "unknown publisher";
		
	}
	
	public Book(String title, String publisher) {
		setTitle(title);
		setPublisher(publisher);
	}
	
	
	
	//method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title == "") {
			System.out.println("Title cannot be empty.");
			this.title = getTitle();
		}else this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		if(publisher == "") {
			System.out.println("Publisher cannot be empty.");
			this.publisher = getPublisher();
		}else this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [title=" + getTitle() + ", publisher=" + getPublisher() + "]";
	}
	
	


}
